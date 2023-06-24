import java.util.Arrays;

public class findThirdLargest {
    public static void main(String[] args) {
        int []arr = {2,3,1,5,2,8,4,7};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-3]);
    }
}
