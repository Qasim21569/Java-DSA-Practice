
package Arrays;

import java.util.Scanner;

//program to find whether an element is present in an array

public class array2 {
    public static void main(String[] args) {
        float[] marks = { 45.7f, 67.8f, 345.2f, 789.6f, 678.f };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to search: ");
        float num = sc.nextFloat();
        boolean isInArray = false;
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }

        }
        if (isInArray) {
            System.out.println("Element is present in the array");
        } else {
            System.out.println("Element is not present");
        }
    }
}
