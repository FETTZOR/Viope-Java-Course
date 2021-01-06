import java.util.Scanner;

public class ModifyingPrinting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type in your first name: ");
        String name = in.nextLine();
        System.out.println("\n\nHi, " + "\"" + name + "\"" +  "");
        System.out.println("\tThe name of this exercise is 'Modifying printing'.");
        System.out.println("\tTabulator, line change and quotations have already been used in this exercise.");
        System.out.println("\tForward slash (\\) is also usable in printing.\n");
        System.out.println("\n\t\t*** End of exercise ***");
    }
}
 //   Write a program that asks for the firs
//   t name of the user and then prints the text shown in
//   the example print. The print should be modified to be id
//   entical with the example print. Tabulator has been used to cr
//   eate the empty spaces in the beginning of each line.