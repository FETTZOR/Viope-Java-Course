import java.util.Scanner;

public class ForStatement {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in an integer: ");
        int number = reader.nextInt();
        if (number > 0) {
            for(int i = number; i >= 0; i--)
                System.out.println(i);
        }
        else {
            System.out.print("Input is not a positive integer.");
        }
    }
}
//    Create a program that asks for an integer n (n>0) and prints integers from n to 0 below each other.
//        This means that a line change must be printed after each number. for statement is to be used
//        for printing the numbers. If user types in a negative number
//        or zero, the text “Input is not a positive integer.” is printed on screen and program execution ends.