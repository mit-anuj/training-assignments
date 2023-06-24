import java.util.Arrays;

public class findNthLargest {
    public static void main(String[] args) {
        int arr[] = {1,7,2,8,4,3,6,10};
        int n = 5;
        if(n>=arr.length){
            System.out.println("wrong input");
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-n]);
    }
}
