// Program to count occurrences of a number in an array

package Arrays;

import java.util.Scanner;

public class array9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to count: ");
        int num = sc.nextInt();

        // logic to count occurences
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                count++;
            }
        }

        System.out.println("The number " + num + " occured " + count + " times.");
        sc.close();
    }
}
