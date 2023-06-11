public class productOfArray{
    static int[] calcproduct(int []arr, int index,int count){
        if(index== arr.length){
            return new int[count]; 
        }
        int []result = calcproduct(arr, index+1, count+1);
        result[index]=(int)Math.pow((arr[index]),2);
        return result;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int []result = calcproduct(arr,0,0);
        for(int i : result){
            System.out.println(i);
        }
    }
}