//Program to find largest and smallest elements from a user entered array

package Arrays;

import java.util.Scanner;

public class array7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + "elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize largest and smallest element with the first element
        int largest = arr[0];
        int shortest = arr[0];

        // Traversing the array to find smallest and largest
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < shortest) {
                shortest = arr[i];
            }
        }

        // Printing the shortest and largest elements

        System.out.println("Largest element is: " + largest);
        System.out.println("Smallest element is: " + shortest);

        sc.close();

    }
}
