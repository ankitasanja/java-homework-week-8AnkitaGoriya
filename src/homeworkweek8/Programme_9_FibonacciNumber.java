package homeworkweek8;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Programme_9_FibonacciNumber {

    public static void main(String[] args) {

        // Set it to the number of elements you want in the fibonacci series

        int maxNumber = 10;
        int previousNumber = 1;
        int nextNumber = 1;

        System.out.println("Fibonacci Series of " + "maxNumber" + "numbers");

        for (int i = 1; i <= maxNumber; ++i) {
            System.out.println(previousNumber + " ");

            // on each iteration , we are assigning second number to the first number
            // and assigning the sum of last two numbers to the second number

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
