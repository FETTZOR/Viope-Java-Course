public class InitializingArrays {
    public static void main(String[] args) {
        // Write here the missing variable definitions and initializations
        int[] numberArray = {4, 7, 8, 2, 8, 3, 7, 1};
        String[] nameArray = {"May", "Peggy", "Tina", "Sue"};
        int [ ] [ ] matrix = {   { 2 },
                { 4, 6 },
                { 8, 10, 12},
                {  14, 16 },
                { 18 }
        };
        System.out.print("Number in array: ");
        for(int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }

        System.out.print("\n\nNames in array: ");
        for(int i = 0; i < nameArray.length; i++) {
            System.out.print(nameArray[i] + " ");
        }

        System.out.println("\n\nMatrix elements: ");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\t");
        }
    }
}

//    The Java-program Arrays below prints the elements of
//        the arrays on screen. Your task is to write the missing
//        array declarations and initializations.
//        Check the example print for initialization values.