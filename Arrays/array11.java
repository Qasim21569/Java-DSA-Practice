// Program to reverse an array using recursion

package Arrays;

import java.util.Scanner;

public class array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calling the recursive function
        reverseArray(arr, 0, n - 1);

        // Printing the reversed array
        System.out.println("Reversed array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    // Recursive funtcion to reverse the array
    static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start + 1, end - 1);
    }
}
