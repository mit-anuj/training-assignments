public class printAllOccurences {
    
    static int[] getAllOccurences(int []arr, int element, int index,int count){
        if(index== arr.length){
            return new int[count];
        }
        if(arr[index]==element){
            count++;        
        }
        int []result = getAllOccurences(arr, element, index+1, count);
        if(arr[index]==element){
            result[count-1] = index;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,2,1,4};
        int []result = getAllOccurences(arr, 2, 0, 0);
        for (int i : result) {
            System.out.println(i);
        }
    }

}
