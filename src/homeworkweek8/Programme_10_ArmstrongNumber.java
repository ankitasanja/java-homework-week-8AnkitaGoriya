package homeworkweek8;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme_10_ArmstrongNumber {

    public static void main(String[] args) {

        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);

        //Input number to check if it is Armstrong number
        System.out.println("Please enter any number to check if it Armstrong number: ");
        int num = scanner.nextInt();

        //printing result
        if (isArmstrongNumber(num)) {
            System.out.println("Number : " + num + " is an Armstrong number");
        } else {
            System.out.println("Number: " + num + " is not an Armstrong number");
        }

        //Closing the scanner object
        scanner.close();
    }

    public static boolean isArmstrongNumber(int num) {
        int result = 0;
        int orig = num;
        while (num != 0) {
            int remainder = num % 10;
            result = result + remainder * remainder * remainder;
            num = num / 10;
        }
        //number is Armstrong return true
        if (orig == result) {
            return true;
        }
        return false;
    }
}
