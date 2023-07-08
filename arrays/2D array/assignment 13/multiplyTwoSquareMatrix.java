public class multiplyTwoSquareMatrix {
    public static void multiply(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[matrixA.length][matrixB.length];
        int sum = 0;
        for (int k = 0; k < matrixA.length; k++) {
            for (int i = 0; i < matrixA.length; i++) {
                for (int j = 0; j < matrixB.length; j++) {
                    sum += matrixA[k][j] * matrixB[j][i];
                }
                result[k][i] = sum;
                sum = 0;
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                matrixA[i][j] = result[i][j];
            }
            
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }};
                multiply(matrix, matrix);
    }
}
