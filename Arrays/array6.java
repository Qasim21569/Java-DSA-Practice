//Program to find the second largest number in a user provided array
package Arrays;

import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements you want in your array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array one-by-one");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        /*
         * main logic to fnd second largest element, (Integer.MIN_VALUE is just
         * the lowest known value java knows)
         */
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        // Printing the result

        if (secondLargest == 0) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
        sc.close();
    }
}
