package homeworkweek8;

/**
 * 8. Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */

public class Programme_8_RightAngleTriangle {

    public static void main(String[] args) {
         int rows = 5; // Input number of rows

        for (int i = 0; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println(" ");
        }
    }
}
