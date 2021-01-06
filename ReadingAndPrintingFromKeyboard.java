import java.util.Scanner;

public class ReadingAndPrintingFromKeyboard {
    public static void main (String[] args) {
        int number1 = 0, number2 = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first number: ");
        number1 = reader.nextInt();
        System.out.print("Type the second number: ");
        number2 = reader.nextInt();
        int sum = number1 + number2;
        System.out.print("Sum of the numbers you typed is " + sum);
    }
}
//    Make a program that asks two integers from the user, counts their
//        sum and prints the result on screen. Use methods from Scanner class to read the data.