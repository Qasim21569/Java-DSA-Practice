package Arrays;

import java.util.Scanner;

public class array5 {

    // Step 1: asking user to enter no of elements
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the aray: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        // Step 2: Input the elements of an array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Step 3: Reverse the array (Calling the reverse method)
        reverseArray(array);

        // Step 4: Display reversed array (using for-each loop)
        System.out.println("Reversed array is: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    // Writing the actual method to reverse the array (By using pointers)
    public static void reverseArray(int[] arr) {
        int start = 0; // Start pointer
        int end = arr.length - 1; // End pointer

        // While loop for swapping elements until they meet in center
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

}
