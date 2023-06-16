public class missingNumber {
    class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum = n*(n+1)/2;
        int newSum = calcSum(array,array.length-1);
        return sum - newSum;
        
    }
    int calcSum(int array[],int index){
        if(index<0){
            return 0;
        }
        int sum = calcSum(array,index-1);
        sum = sum + array[index];
        return sum;
    }
}
}
