import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it's prime or not:");
        int number = scanner.nextInt();

        if (number == 0 || number == 1) {
            System.out.println(number + " is neither prime nor composite");
            return;
        }

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {

            System.out.println(number + " is not a prime number");
        }
        scanner.close();

    }
}
