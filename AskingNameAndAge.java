import java.util.Scanner;

public class AskingNameAndAge {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your last name: ");
        String secondName= reader.nextLine();
        System.out.print("Type in your first name: ");
        String firstName = reader.nextLine();
        System.out.print("Type in your age: ");
        int age = reader.nextInt();
        System.out.println("You are " + firstName + " " + secondName + " and your age is " + age + " years.");
    }
}
