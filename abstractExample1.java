import java.util.Scanner;

class userInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Greet me");
        System.out.println("2. Tell me a joke");
        System.out.println("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        scanner.nextLine();

        if (choice == 1) {
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            System.out.println("Hello" + name + "! Have  great day");
        } else if (choice == 2) {
            System.out.println("Why don't skeletons fight each other? They don't have the guts!");
        } else {
            System.out.println("Invalid choice");
        }
        scanner.close();
    }
}