package multithread;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ForkJoinPool;

public class MergeUtils {

    public static int[] generateLargeArray(int size){
        int[] array = new int[size];
        
        // Fill the array with random integers
        for(int i = 0; i < size; i++){
            array[i] = (int)(Math.random() * 1000);
        }
        return array;
    }
    private static class MergeSortTask extends RecursiveAction{
        private int[] array;
        private int left, right;

        public MergeSortTask(int[] array, int left, int right){
            this.array = array;
            this.left = left;
            this.right = right;
        }

        @Override
        protected void compute(){
            if (left < right){
                int mid = (left + right) / 2;

                // Create the subtasks for sorting both haves concurrently
                MergeSortTask leftTask = new MergeSortTask(array, left, mid);
                MergeSortTask rightTask = new MergeSortTask(array, mid + 1, right);

                // Invoke both task concurrently
                invokeAll(leftTask, rightTask);

                // Merge the sorted halves
                merge(array, left, mid, right);
            }
        }

        // Helper method to merge the two halves after sort
        private void merge(int[] array, int left, int mid, int right){
            int n1 = mid - left + 1;
            int n2 = right - mid;
            
            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];

            // Copy data to temp arrays
            System.arraycopy(array, left, leftArray, 0, n1);
            System.arraycopy(array, mid + 1, rightArray, 0, n2);

            int i = 0, j = 0, k = left;

            // Merge temp arrays back into the main array
            while(i < n1 && j < n2){
                if (leftArray[i] < rightArray[j]){
                    array[k++] = leftArray[i++];
                }else{
                    array[k++] = rightArray[j++];
                }            
            }

            while (i < n1){
                array[k++] = leftArray[i++];
            }
            while(j < n2){
                array[k++] = rightArray[j++];
            }
        }
    }

    public static void parallelMergeSort(int[] array){
        ForkJoinPool pool = ForkJoinPool.commonPool();
        pool.invoke(new MergeSortTask(array, 0, array.length -1));
        pool.shutdown();
    }



}


