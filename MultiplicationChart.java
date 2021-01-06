import java.util.Scanner;

public class MultiplicationChart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number:");
        int number = reader.nextInt();
        count(number);
    }

    public static void count(int number) {
        System.out.println("Multiplication chart of the number " + number);
        for(int i = 1; i<=10;i++) {
            int result = number*i;
            System.out.println(result);
        }
    }
}
//    Write a method that receives an integer
//        as parameter and prints the multiplication chart of that
//    number as shown in the example print. Method name shall be count.
