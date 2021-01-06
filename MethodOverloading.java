import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        String firstName, secondName;
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the first name: ");
        firstName = reader.nextLine();

        System.out.print("Type in the second name: ");
        secondName = reader.nextLine();

        System.out.println("\n**********");
        greet();
        System.out.println("**********");

        greet(firstName);
        System.out.println("**********");

        greet(firstName, secondName);
        System.out.println("**********");
    }
    private static void greet(){
        System.out.println("Hi!");
    }
    private static void greet(String firstName) {
        System.out.println("Hi, " + firstName);
    }

    private static void greet(String firstName, String secondName) {
        System.out.println("Hi, " + firstName + " and " + secondName);
    }

}
//The class Overloading below asks for two names and prints three
//        different greetings. Your task is to write the class methods
//        missing from the class declaration.
//        Methods print the greetings as shown in the example print.