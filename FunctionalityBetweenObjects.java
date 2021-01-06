import java.util.Scanner;


public class FunctionalityBetweenObjects {
    public static void main(String args[]) {
        Printer thing = new Printer();
        thing.Print();
    }
}

class Printer {
    public void Print() {

        Scanner reader = new Scanner(System.in);
        System.out.print("Type in the first integer: ");
        int firstNum = reader.nextInt();
        System.out.print("Type in the second integer: ");
        int secondNum = reader.nextInt();
        System.out.print("Sum of the numbers: "+ Calculator.Sum(firstNum, secondNum));
    }
}

class Calculator {
    static int Sum(int first, int second) {
        int sum = first + second;
        return sum;
    }
}
//    There are two classes ready in the exercise:
//        ObjectFunctionality and Calculator.
//        Your task is to create the class Printer which asks
//for two integers from the user, calls the method Sum() of class
//Calculator relaying the inputted integers to the method. Method Sum()
//        counts the sum of the numbers
//        and returns the result. Finally Sum() prints the sum on screen.