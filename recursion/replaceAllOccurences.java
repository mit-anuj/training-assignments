public class replaceAllOccurences {
    // tail recursion.
    static void replace(int []arr, int index, int element, int newElement){
        if(index== arr.length){
            for(int i : arr){
                System.out.print(i+" ");
            }
            return;
        }
        if(arr[index]==element){
            arr[index]=newElement;
        }
        replace(arr, index+1, element, newElement);
    }

    // head recursion.

    static int[] replaceAll(int []arr, int index, int element, int newElement){
        if(index== arr.length){
            return new int[arr.length];
        }
        int result[]= replaceAll(arr, index+1, element, newElement);
        if(arr[index]==element){
            result[index]=newElement;
        }
        else{
            result[index]=arr[index];
        }
        return result;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,2,2,1,4};
        // replace(arr, 0, 2, 9);
        int []result=replaceAll(arr, 0, 2, 9);
        for(int i :result)
            System.out.print(i+" ");
    }
}
