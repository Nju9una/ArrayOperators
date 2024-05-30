public class ArrayOperations {
    public static void main(String[] args) {
        int[] ten = {10, 20, 20, 40, 550, 60, 70, 80, 90, 100};
        int sum = 0;
        for (int num : ten) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
        sortDescending(ten);
        for (int i = 0; i < ten.length; i++) {
            if (ten[i] == 100) {
                ten[i] = 1000;
                break; 
            }
        }
        System.out.print("Modified array: ");
        for (int num : ten) {
            System.out.print(num + " ");
        }
    }
    public static void sortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
