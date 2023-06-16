public class powerOfThree{
    static boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%3==0){
            return isPowerOfThree(n/3);
        }
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
}