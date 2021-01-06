import java.util.Scanner;
public class ReverseNumbers {
    public static void main(String[] args) {

        float[] numbers;
        int amountOfNumbers = 0;

        Scanner reader = new Scanner(System.in);

        System.out.print("How many floating point numbers do you want to type: ");
        amountOfNumbers = reader.nextInt();

        numbers = new float[amountOfNumbers];

        for (int i = 0; i < numbers.length; ++i) {
            System.out.print("Type in " + (i + 1) + ". number: ");
            numbers[i] = reader.nextFloat();
        }

        System.out.println("Given numbers in reverse order: ");
        for (int i = (numbers.length - 1); i >= 0; --i) {
            System.out.println(numbers[i]);
        }
    }
}


//        Type in 1. number: -4
//        Type in 2. number: 2,6
//        Type in 3. number: 3
//
//        Given numbers in reverse order:
//        3.0
//        2.6
//        -4.0