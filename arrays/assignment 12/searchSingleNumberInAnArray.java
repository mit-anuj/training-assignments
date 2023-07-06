import java.util.Arrays;

public class searchSingleNumberInAnArray {
    public int singleNumber(int[] nums) {
        // Arrays.sort(nums);
        // for(int i = 0;i<nums.length;i++){
        //     if(i==0){
        //         if(nums[i]!=nums[i+1])
        //             return nums[i];
        //     }else if(i>0 && i<nums.length-1){
        //         if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
        //             return nums[i];
        //         }
        //     }else{
        //         if(nums[i]!=nums[i-1]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return -1;
        int ans=0; //since XOR with 0 returns same number 
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  // ans = (ans) XOR (array element at i) 
        }
        return ans; 
    }
    public static void main(String[] args) {
        searchSingleNumberInAnArray s = new searchSingleNumberInAnArray();
        int []arr= {4,1,2,1,2};
        System.out.println(s.singleNumber(arr));
    }
}
