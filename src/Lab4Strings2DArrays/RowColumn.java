package Lab4Strings2DArrays;

public class RowColumn {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int)(Math.random() * 2);
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }


        int maxRow = 0;
        int max = 0;
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                maxRow = i;
            }
        }
        System.out.println("The largest row index: " + maxRow);

        int maxCol = 0;
        max = 0;
        for (int col = 0; col < mat[0].length; col++) {
            int count = 0;
            for (int row = 0; row < mat.length; row++) {
                if (mat[row][col] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                maxCol = col;
            }
        }
        System.out.println("The largest row column: " + maxCol);
    }
}