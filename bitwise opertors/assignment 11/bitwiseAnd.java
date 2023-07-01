public class bitwiseAnd{
    public static void main(String[] args) {
        int []arr = {3,5,8,10,12};
        int max = 0;
        for(int  i = 0; i < arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if(max<(arr[i]&arr[j])){
                    max = arr[i]&arr[j];
                }
            }
        }
        System.out.println(max);
    }
}