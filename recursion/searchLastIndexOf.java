public class searchLastIndexOf {
    // tail recursion.
    static void lastIndexOf(int []arr, int index,int finalIndex, int element) {
        if(index==arr.length){
            System.out.println(finalIndex>-1?finalIndex:"not found");
            return;
        }
        if(arr[index]==element){
            finalIndex = index;
        }
        lastIndexOf(arr, index+1, finalIndex, element);
    }

    // head recursion.
    static int lastIndexOf(int []arr, int index, int element){
        if(index==arr.length-1){
            return arr[index]==element?index:-1;
        }
        int finalIndex=lastIndexOf(arr, index+1, element);
        if(finalIndex>-1){
            return finalIndex;
        }else{
            return arr[index]==element?index:-1; 
        }
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4};
        // lastIndexOf(arr,0,-1,4);
        System.out.println(lastIndexOf(arr, 0, 2));
        
    }
}
