package multithread;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        long elapsedTime;

        int[] largeArray = MergeUtils.generateLargeArray(1000000);

        System.out.println(Arrays.toString(largeArray));

        System.out.println("Original Array: " + Arrays.toString(largeArray));
        
        startTime = System.currentTimeMillis();
        
        MergeUtils.parallelMergeSort(largeArray);

        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;

         System.out.println("Sorted Array in " + elapsedTime + " milliseconds.");




        
    }

}
