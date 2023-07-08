public class KWeakestRowIn2DArray {
    public static int[] KWeakestRow(int[][] mat, int k) {
        int[] arr = new int[mat.length];
        int[] result = new int[k];
        int count = 0;
        // Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            arr[i] = count;
            // map.put(i, count);
            count = 0;
        }
        int index = 0;
        while (index < k) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == count) {
                    result[index] = j;
                }
            }
            index++;
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 1 } };
        int []result = KWeakestRow(mat, 3);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
