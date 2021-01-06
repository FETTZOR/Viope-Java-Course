import java.util.Scanner;

public class CheckingIfNumberIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type in an integer: ");
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.print("Number " + number + " is even.");
        }
        else if (number % 2 != 0) {
            System.out.print("Number " + number + " is odd.");
        }
        else {
            System.out.print("Input is invalid");
        }
    }
}
//    Create a program that asks for a positive integer (zero will not do)
//    and check if the number is even or odd. If number is even, “Number X is even”
//    is printed on screen and “Number X is odd” is printed if the number is odd. X
//    marks the number user types in. If the given number is zero or a negative number,
//    program prints “Input is invalid” on screen and program execution ends.
//
//        Hint: Number is even if its division remainder is 0 when divided by 2.
