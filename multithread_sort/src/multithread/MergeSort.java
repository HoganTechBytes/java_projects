package multithread;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] largeArray = MergeUtils.generateLargeArray(100000);

        System.out.println(Arrays.toString(largeArray));
        
    }

}
