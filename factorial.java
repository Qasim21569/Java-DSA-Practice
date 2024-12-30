import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer to calculate its factorial: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial cannot be calculated for negative numbers");

        } else {
            long factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            System.out.println("The factorial of " + number + "is : " + factorial);
        }
        scanner.close();
    }
}
