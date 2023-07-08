import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int row = 0;
        int col = 0;
        int index = 0;
        boolean flag = true;
        int countCol = 0;
        int countRow = 0;
        // !print 1 row ,last column and last row.
        while (index < 3) {
            if (index % 2 == 0 && flag) {
                while (col < matrix[row].length) {
                    result.add(matrix[row][col]);
                    col++;
                }
                countRow++;
                index++;
            } else if (index % 2 == 1 && flag) {
                col--;
                row++;
                while (row < matrix.length) {
                    result.add(matrix[row][col]);
                    row++;
                }
                index++;
                countCol++;
                flag = !flag;
            } else {
                row--;
                col--;
                while (col >=0 && !flag) {
                    result.add(matrix[row][col]);
                    col--;
                }
                index++;
                countRow++;
            }
            if(index % 2 == 1 && !flag) {
                row--;
                while(){
                    result.add(matrix[row][col]);
                    row--;
                }
        }


        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3,4 },
                {  5, 6,7,8 },
                {  9,10,11,12 } };
                System.out.println(spiralOrder(matrix));
    }
}