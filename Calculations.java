import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose from the following calculations:\n" +
                "1: subtraction\n" +
                "2: addition\n" +
                "3: multiplication\n" +
                "4: division\n" +
                "5: remainder");
        System.out.print("\nMake your choice: " );
        int number = in.nextInt();
        if (number >= 1 && number <= 5) {
            System.out.print("Type in the first number: ");
            int number1 = in.nextInt();
            System.out.print("Type in the second number: ");
            int number2 = in.nextInt();
            switch (number) {
                case 1:
                    System.out.print(number1 + " - " + number2 + " = " + (number1 - number2));
                    break;
                case 2:
                    System.out.print(number1 + " + " + number2 + " = " + (number1 + number2));
                    break;
                case 3:
                    System.out.print(number1 + " * " + number2 + " = " + (number1 * number2));
                    break;
                case 4:
                    double divisionResult =  (double) number1 / (double)number2;
                    if ( divisionResult % 1 == 0)System.out.print(number1 + " / " + number2 + " = " + (int)divisionResult);
                    else System.out.print(number1 + " / " + number2 + " = " + divisionResult);
                    break;
                case 5:
                    System.out.print(number1 + " % " + number2 + " = " + (number1 % number2));
                    break;
            }
        }
        else {
            System.out.println("Invalid choice.");
        }
    }
}
//    Create a calculator program which lets the user choose
//        what calculation to perform. First the program asks what
//        calculation is to be performed. Then the program asks for two integers,
//        performs the chosen calculation between the given numbers and prints the
//        result on screen. The choosing of the calculation is to be done using switch statement.
//        If, when choosing the calculation type, the user input is not a number between 1 and 5,
//        program prints “Invalid choice” and program execution ends. Hence the user will not be
//        prompted to input two integers if the original calculation choice is not a number between 1 and 5.