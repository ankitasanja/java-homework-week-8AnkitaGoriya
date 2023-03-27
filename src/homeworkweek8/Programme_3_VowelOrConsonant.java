package homeworkweek8;

import java.util.Scanner;

/**
 * 3. Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme_3_VowelOrConsonant {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input an Alphabet:  ");
        String input = sc.nextLine().toLowerCase();
        if (input.length() > 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: please enter a single letter");
        } else {
            char letter = input.charAt(0);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("Input letter is vowel");
            } else {
                System.out.println("Input letter is consonant");
            }
            //Closing the scanner object
            sc.close();
        }
    }
}