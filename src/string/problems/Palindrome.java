package string.problems;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */
        String original;
        StringBuilder reverse = new StringBuilder(" ");
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter a string: ");
        original = stdin.nextLine();
        int length = original.length();

        for(int i = length-1; i>=0; i--){
            reverse.append(original.charAt(i));
        }
        if(original.equals(reverse.toString())){
            System.out.println("Entered string is palindrome.");
        }
        else {
            System.out.println("Entered string is not palindrome. ");
        }

    }
}
