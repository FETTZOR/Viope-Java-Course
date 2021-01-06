import java.util.Scanner;

public class CalculatingDecimalNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in the first number: ");
        float firstNumber = reader.nextFloat();
        System.out.print("Type in the second number: ");
        float secondNumber = reader.nextFloat();
        float multiplicationResult = firstNumber * secondNumber;
        float divisionResult = firstNumber/secondNumber;
        System.out.println("Result of the multiplication: " + multiplicationResult + "\nResult of the division: " + divisionResult);
    }
}
//    Create a Java-program that asks for two double type floating point numbers and then
//        performs multiplication and division with the given numbers. First number acts as
//        the divided number in division and the second
//        one is the divisor. The program prints the results of both calculations in the end.
