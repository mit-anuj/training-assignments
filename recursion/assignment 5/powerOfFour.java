public class powerOfFour {
    public static boolean isPowerOfFour(int n) {
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%4==0){
            return isPowerOfFour(n/4);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(36));
    }
}
