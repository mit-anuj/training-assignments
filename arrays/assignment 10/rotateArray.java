public class rotateArray {
    public void reverse(int []nums,int start,int end){
        int temp;
        while(start<end){
            temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        if(k>=nums.length){
            k=k%nums.length;
        }
        //rotating first half
        reverse(nums,0,nums.length-k-1);
        // rotating second half
        reverse(nums,nums.length-k,nums.length-1);
        //rotating full array
        reverse(nums,0,nums.length-1);
    }
}
