import java.util.Scanner;
public class WorkHourCalculator {
    public static void main(String[] args) {

        double[] workHours;
        int amountOfDays = 0;
        double sum = 0;

        Scanner reader = new Scanner(System.in);

        System.out.print("Amount of Days: ");
        amountOfDays = reader.nextInt();

        workHours = new double[amountOfDays];

        for (int i = 0; i < workHours.length; ++i) {
            System.out.print("Type in work hours of day " + (i + 1) + ": ");
            workHours[i] = reader.nextDouble();
        }
        for( double num  : workHours) {
            sum = sum + num;
        }
        System.out.println("\nTotal of work hours: " + sum);
        double avg = 0;
        for(int i=0; i<workHours.length; i++){
            avg = avg + workHours[i];
        }
        double average = avg / workHours.length;

        System.out.println("average work day length: " + average);
        System.out.print("Inputted work hours: ");
        double inputted = 0;
        for (int i = 0; i < workHours.length; ++i) {
            System.out.print(workHours[i] + " ");
            inputted += workHours[i];
        }
    }
}
//    Create a program that counts the number of work hours in given time
//        and prints the total amount of hours, average work day length
//        and inputted hours separately. Program should first ask the
//        number of days to
//        enter, after this the program asks the daily work hours.