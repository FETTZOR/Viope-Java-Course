import java.util.Scanner;

public class CountingSalary {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in the amount of work hours: ");
        float workHours = reader.nextFloat();
        System.out.print("Type in the salary per hour: ");
        float salaryPerHour = reader.nextFloat();
        System.out.print("Type in the tax percent: ");
        float taxPercent = reader.nextFloat();
        float salaryBeforeTaxes = workHours * salaryPerHour;
        float amountOfTaxes = workHours*salaryPerHour*taxPercent/100;
        float salaryAfterTaxes = salaryBeforeTaxes - amountOfTaxes;
        System.out.println("Salary before taxes: " + salaryBeforeTaxes);
        System.out.println("Amount of tax: " + amountOfTaxes);
        System.out.println("Salary after taxes: " + salaryAfterTaxes);
    }
}
//    Create a Java-program that prints the salary of an employee before taxes, after taxes and the amount of tax.
//
//        Program first asks for three floating point numbers (work hours, salary per hour and tax percent) and based on
//        these values, calculates amount of taxes and salary before and after taxes
