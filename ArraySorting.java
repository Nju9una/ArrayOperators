import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {  
        int[] largeArray = {5, 2, 8, 3, 1, 6, 4,5,6,5,12,33,45,57,68,44,33,18,58,96,43,11,3,33,57,55,87,88,};
        Arrays.sort(largeArray);

        System.out.println("Sorted Array: " + Arrays.toString(largeArray));  
    }
}
