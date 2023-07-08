public class setMatrixZeros {
    public static void setRowZeros(int[][] matrix, int row) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = 0;
        }
    }

    public static void setColZeros(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

    public static void setZeros(int[][] matrix) {
        int[][] newMatrix = new int [matrix.length][matrix[0].length];
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                newMatrix[i][j] = -1;
            }
        }
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                if (matrix[i][j] == 0 ) {
                    setColZeros(newMatrix, j);
                    setRowZeros(newMatrix, i);
                } else if(newMatrix[i][j] !=0) {
                    newMatrix[i][j] = matrix[i][j];
                }
            }
        }
        // matrix = newMatrix;
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[i].length; j++) {
                matrix[i][j]=newMatrix[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 0,1,2,0 },
                { 3,4,5,2 },
                { 1,3,1,5 } };
        setZeros(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
