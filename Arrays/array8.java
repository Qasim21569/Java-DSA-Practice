//Progrm to check whether an array is sorted or not

package Arrays;

import java.util.Scanner;

public class array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements sequentially: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // logic to check array is sorted or not

        boolean isSorted = true; // Assume array is sorted initially

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted");
        }
        sc.close();
    }
}
