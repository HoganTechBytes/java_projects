package multithread;

public class MergeUtils {

    public static int[] generateLargeArray(int size){
        int[] array = new int[size];
        
        // Fill the array with random integers
        for(int i = 0; i < size; i++){
            array[i] = (int)(Math.random() * 1000);
        }
        return array;
    }

}
