package Chapter10_ObjectOrientedThinking;

import java.util.Scanner;

public class PalindromeIgnoreNonAlphanumeric {
    public static void main(String[] args) {
        //1. Prompt the user to enter a string
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        System.out.println("Ignoring nonalphanumeric characters, \n is [" + s + "] a palindrome? " + isPalindrome(s));
        //2.Fliter all the nonalphanumeric characters in the string

    }
    public static boolean isPalindrome(String s){
        //create a string that has already been flitered the nonalphanumeric characters
        String s1 = filter(s);
        //create another string which is the reversal of s1
        String s2 = reverse(s1);
        //Check if the reversal one is the same with the original one
        return s2.equals(s1);
    }
    public static String filter(String s){
        //create a string builder
        StringBuilder stringBuilder = new StringBuilder();
        //Check each char in the stringBuilder, and then append into the stringBuilder
        for(int i = 0; i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
                stringBuilder.append(s.charAt(i));
        }
        //Return a new flitered string
        return stringBuilder.toString();
    }
    public static String reverse(String s){
        //create a string builder
        StringBuilder stringBuilder = new StringBuilder(s);
        //use the reverse method in the StringBuilder class
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
