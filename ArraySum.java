public class ArraySum {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the array with the given values
        int[] ten = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Step 2: Initialize a variable to hold the sum of the array elements
        int sum = 0;

        // Step 3: Use a for loop to go through each element in the array
        for (int i = 0; i < ten.length; i++) {
            // Step 4: Add the current element to the sum
            sum += ten[i];
        }

        // Step 5: Print the sum of the array elements to the console
        System.out.println("The sum of the array elements is: " + sum);
    }
}






string[] cars = {"Volvo" , "BMW" , "Ford" , "Mazda"};
for (int i = 0; i < car)



//for-each loop
string[] cars = {"Volvo", "BMW" , "Ford", "Mazda"};
for (string i : cars){
    System.out.println(i);
}