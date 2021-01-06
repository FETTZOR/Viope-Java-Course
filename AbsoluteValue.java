import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in a floating point number: ");
        double firstNumber = reader.nextDouble();
        String absoluteNumber = (firstNumber < 0) ? String.valueOf(-firstNumber) : String.valueOf(firstNumber);
        System.out.println("The absolute value of the given number is " + absoluteNumber);
    }
}
//    Create a Java-program that asks for a double type floating point number and then prints
//        the absolute value of the number as shown in the example print.
//        Program is to be implemented with the use of conditional operator “?”, using if statement is forbidden.