public class countOccurencesOfElement {
    // tail recursion.
    static void countOccurences(int []arr,int element,int count,int index) {
        if(index == arr.length){
            System.out.println(count);
            return;
        }
        if(arr[index] == element) count++;
        countOccurences(arr, element, count, index+1);
    }

    // head recursion.
    static int countOccurences(int []arr,int element,int index){
        if(index == arr.length){
            return 0;
        }
        int count = countOccurences(arr, element, index+1);
        if(arr[index] == element){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,1,2,2,2,2};
        // countOccurences(arr, 2, 0, 0);
        System.out.println(countOccurences(arr,2,0));
        
    }
}
