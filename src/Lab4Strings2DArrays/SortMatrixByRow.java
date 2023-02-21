package Lab4Strings2DArrays;

import java.util.Scanner;

public class SortMatrixByRow {
    public static void main(String args[]) {
        int matrix[][] = {{39, 27, 11, 42},
                {10, 93, 91, 90},
                {54, 78, 56, 89},
                {24, 64, 20, 65}};

        System.out.println("Before sorting: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }


        Scanner in = new Scanner(System.in);
        System.out.print("Enter the row num: ");
        int row = (in.nextInt() - 1);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) { {
                if (matrix[row][i] > matrix[row][j]) {
                    int temp = matrix[row][i];
                    matrix[row][i] = matrix[row][j];
                    matrix[row][j] = temp;
                }
            }
            }
        }


        System.out.println("After sorting: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        /*
        Arrays.sort(matrix, new Comparator<int[]>() {
            public int compare(final int[] a, final int[] b) {
                if (a[col] > b[col])
                    return 1;
                else
                    return -1;
            }
        });

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                for (int k = 0; k < matrix.length-1; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }

                }
            }
        }

        Arrays.sort(matrix, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] int1, Integer[] int2) {
                Integer numOfKeys1 = int1[col];
                Integer numOfKeys2 = int2[col];
                return numOfKeys1.compareTo(numOfKeys2);
            }
        });*/
    }
}
