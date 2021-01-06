class calcul1 {
    public static void main(String [] args) {
        int characters = args.length;

        if (characters < 3)
            System.out.println("You did not type in a calculation!");
        else if (characters % 2 == 0)
            System.out.println("Invalid number of command line parameters.");
        else {
            CommandLineCalculator counter = new CommandLineCalculator();
            counter.count(args);
        }
    }
}

public class CommandLineCalculator {
    public void count(String[] args) {
        int[] input = new int[args.length];
        String[] operators = new String[args.length];
        int countNums = 0;
        int countOperators = 0;

        for (String arg : args) {
            try {
                input[countNums] = Integer.parseInt(arg);
                countNums++;
            } catch (NumberFormatException e) {
                operators[countOperators] = arg;
                countOperators++;
            }
        }



        int result = 0;
        int count = 0;

        StringBuilder printOutResult = new StringBuilder();

        for (int i = 0; i < countNums; i++) {
            if (i != 0){
                result = doOperation(result, input[i], operators[count]);
                count++;
            } else {
                result = input[i];
            }
        }


        printOutResult.append("Result of the calculation ");
        for (String arg : args) {
            printOutResult.append(arg);
            printOutResult.append(" ");
        }
        printOutResult.append("is ");
        printOutResult.append(result);
        System.out.println(printOutResult.toString());

    }

    private int doOperation(int i, int j, String op) {
        switch (op) {
            case "+":
                return i + j;

            case "-":
                return i - j;

            default:
                System.out.println("Please enter a valid operator");
                return 0;
        }
    }
}
//    The program below is supposed to perform the basic calculations in command
//    prompt. Your task is to write the missing Calculator class. You need only
//        to implement addition and subtraction in the program. The Java-program
//        can be run by giving e.g. the following command: java
//        Commandlinecalculator 4 + 6 + 5 - 5. You need not to worry
//        about error situations, assume that the user knows what to input.
//        In correct input every other character is number and every other is
//        an operator (+ or -). Numbers and operators are separated with spaces.
//        This means that each character in the calculation will be stored as
//        individual command line parameter. Program should
//        print the calculation and the result as shown in the example print.