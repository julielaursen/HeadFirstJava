/**
 * Created by Julie on 12/24/2017.
 */
import java.util.Scanner;

public class inputIntegers {
    //example of manipulating input in java

     //main method begins execution of Java application
        public static void main(String[] args){
            //initialize the Scanner variable input
            //System.in is a scanner object that reads characters typed by the user at the keyboard
            Scanner input = new Scanner(System.in);

            int number1;
            int number2;
            int sum;

            System.out.print("Enter first integer: "); // prompt
            number1 = input.nextInt();
            System.out.print("Enter second integer: "); // prompt
            number2 = input.nextInt();
            sum= number1 + number2;

            System.out.printf("Sum is %d%n", sum);

        } // end method main
}
