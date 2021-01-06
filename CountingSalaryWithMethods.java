import java.util.Scanner;

public class CountingSalaryWithMethods {
    public static void main (String [] args) {
        double hours, salaryPerHour, taxPercent, taxlessSalary, taxPart;

        hours =  askHours();
        salaryPerHour = askSalaryPerHour();
        taxPercent = askTaxPercent();

        taxlessSalary = countTaxlessSalary(hours, salaryPerHour);

        taxPart = taxlessSalary * taxPercent /100;

        System.out.println("\nSalary before taxes: " + taxlessSalary);
        System.out.println("Tax part of the salary: " + taxPart);
        System.out.println("Salary after taxes: " + (taxlessSalary-taxPart));
    }

    private static double countTaxlessSalary(double hours, double salaryPerHour) {
        double countTaxlessSalary = hours * salaryPerHour;
        return countTaxlessSalary;
    }

    private static double askTaxPercent() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in tax percent: ");
        double askTaxPercent = reader.nextDouble();
        return askTaxPercent;
    }

    private static double askSalaryPerHour() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in salary per hour: ");
        double askSalaryPerHour = reader.nextDouble();
        return askSalaryPerHour;
    }

    private static double askHours() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in the number of work hours: ");
        double askHours = reader.nextDouble();
        return askHours;
    }
}

//    Type in the number of work hours: 100
//        Type in salary per hour: 11
//        Type in tax percent: 8
//
//        Salary before taxes: 1100.0
//        Tax part of the salary: 88.0
//        Salary after taxes: 1012.0