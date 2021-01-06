import java.util.Scanner;

public class CalculatingTheMeanAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program calculates the average of inputted grades.\n" +
                "Finish with a negative integer.");
        int grades = 0;
        double total = 0;
        System.out.print("Input a grade (4-10): ");
        float number = in.nextFloat();


        while (number >= 0) {
            if (number >= 4 && number <= 10) {
                total = number + total;
                grades++;
                System.out.print("Input a grade (4-10): ");
                number = in.nextFloat();
            }
            else if (number < 4 && number >= 0 || number > 10) {
                System.out.print("Invalid grade!\nInput a grade (4-10):  ");
                number = in.nextFloat();
            }

            else {
                System.out.println("You did not input any grades.\nInput a grade (4-10):  ");
                number = in.nextFloat();
            }
        }
        if (grades > 0) {
            double average = total / grades;
            System.out.println("\n" + grades + " grades inputted.");
            System.out.println("Average of the grades: " + average);
        }
        else{
            System.out.print("\nYou did not input any grades.");
        }
    }
}
//    Create a program that asks for results of exams and calculates the mean average of the grades.
//        Grades are floating point numbers between 4 and 10. Program asks for grades until a
//        negative number is typed. If user gives a grade other than a number between 4 and 10,
//        the text “Invalid grade!” will be printed on screen and program asks for another grade.
//        Finally the program prints the number of inputted grades and their mean average on screen as
//        shown in the example print.
//        If no grades were inputted, the notice “You did not input any grades.” is the only thing printed on screen.