// //Program to check whether string is palindrome or not

// package Strings;

// import java.util.Scanner;

// public class strings1 {

//     public static boolean isPalindrome(String word) {
//         char[] charArray = word.toCharArray();
//         int start = 0;
//         int end = word.length() - 1;
//         while (start < end) {
//             if (charArray[start] != charArray[end]) {
//                 return false;
//             }
//             start++;
//             end--;

//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the word to check if it is palindrome or not: ");
//         String word = sc.nextLine();

//         if (isPalindrome(word)) {
//             System.out.println("The word " + word + " is a palindrome.");
//         } else {
//             System.out.println("The word " + word + " is not a palindrome.");
//         }
//         sc.close();
//     }

// }

package Strings;

import java.util.Scanner;

public class strings1 {

    public static boolean isPalindrome(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;

            }
            start++;
            end--;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to check if it's palindrome or not: ");
        String word = sc.nextLine();

        if (isPalindrome(word)) {
            System.out.println("The word " + word + " is a palindrome.");
        } else {
            System.out.println("The word " + word + " is not a palindrome.");
        }
        sc.close();
    }
}