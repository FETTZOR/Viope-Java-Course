import java.util.Scanner;

public class InnerLoops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in the height: ");
        int number1 = reader.nextInt();
        System.out.print("Type in the width: ");
        int number2 = reader.nextInt();
        if (number1 > 1 && number2 > 1) {
            for (int j = 1; j <= number1; j = j + 1) {
                for (int i = 1; i <= number2; i = i + 1) {
                    System.out.print("X");
                }
                System.out.println();
            }
        }
        else {
            System.out.print("Invalid height or width value.");
        }
    }
}
//    Create a program that draws a rectangle on screen by given input.
//        First the program asks for the height and width of the rectangle
//        as integers. After doing this the program prints a grid as shown
//        in the example print. If the given height or width is smaller than 1,
//        the text “Invalid height or width value” is printed on screen and height and width are asked again.