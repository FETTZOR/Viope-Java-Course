import java.util.Scanner;

public class HandlingMatrices {
    public static void main(String[] args) {
        int rows, columns;
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the number of rows: ");
        rows = reader.nextInt();
        System.out.print("Type in the number of columns: ");
        columns = reader.nextInt();

        int matrix[][];

        matrix = askInfo(rows, columns);
        printMatrix(matrix);
        countSum(matrix);
    }


    public static int[][] askInfo(int rows, int columns) {
        Scanner reader = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(
                        "Type in the element " + (j + 1) + " of the row " + (i + 1) + ": ");
                matrix[i][j] = reader.nextInt();
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Matrix:");
        for (int row = 0; row < matrix.length; ++row) {
            for (int columns = 0; columns < matrix[row].length; ++columns) {
            }
        }
        for (int row = 0; row < matrix.length; ++row) {
            for (int columns = 0; columns < matrix[row].length; ++columns) {
                System.out.print(" " + matrix[row][columns] + " ");
            }
            System.out.println();
        }
    }

    private static void countSum(int[][] matrix){
        int sum = 0;
        for (int row[] : matrix)
            for (int cell : row) {
                sum += cell;
            }

        System.out.println("Sum of the elements of the matrix: " + sum);
    }
}

//    Type in the number of rows: 2
//        Type in the number of columns: 3
//        Type in the element 1 of the row  1: 9
//        Type in the element 2 of the row  1: 8
//        Type in the element 3 of the row  1: 7
//        Type in the element 1 of the row  2: 6
//        Type in the element 2 of the row  2: 5
//        Type in the element 3 of the row  2: 4
//
//        Matrix:
//        9	8	7
//        6	5	4
//
//        Sum of the elements of the matrix: 39

//  Write the missing methods here
//  Methods are written in the text box below.