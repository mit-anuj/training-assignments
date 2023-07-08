public class addTwoSquareMatrix {
    public static void addition(int[][] matrixA, int[][] matrixB) {
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                matrixA[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA.length; j++) {
                System.out.print(matrixA[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrixA = { { 1, 2 }, { 3, 4 } };
        int[][] matrixB = { { 4, 3 }, { 2, 1 } };
        addition(matrixA, matrixB);
    }
}
