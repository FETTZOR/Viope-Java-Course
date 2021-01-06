import java.util.Scanner;

public class ObjectIntroduction {
    public static void main(String args[]) {
        String characterString;
        Scanner reader =  new Scanner(System.in);
        PrintingClass printer = new PrintingClass();

        System.out.print("Type in the character string for printing: ");
        characterString = reader.nextLine();
        printer.Print(characterString);
    }
}
class PrintingClass {
    public void Print(String characterString) {

        System.out.print(characterString);
    }
}

//
//
//  Write the missing class here
//  Class is written in the text box below.
//Type in the character string for printing: Matt Jackson is here
//        Matt Jackson is here