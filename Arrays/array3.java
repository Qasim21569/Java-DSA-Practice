//// Program to calculate the average marks in Physics for a class of students.

package Arrays;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        if (numStudents <= 0) {
            System.out.println("No Students in the class.");
            sc.close();
            return;
        }

        float[] marks = new float[numStudents];
        float sum = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter marks for student" + (i + 1) + ":");
            marks[i] = sc.nextFloat();
            sum += marks[i];
        }
        float average = sum / numStudents;
        System.out.println("The average physics score of the class is: \n" + average);
        sc.close();

    }
}
