public class Prime {
    //tail recursion.
    static void checkPrime(int number,int check) {
        if(check==1){
            // isPrime == true ?System.out.println("numeber is prime") :System.out.println("numeber is not prime");
            System.out.println("prime");
            return;
        }
        if(number%check==0){
            System.out.println("not prime");
            return;
        }
        checkPrime(number, check-1);

    }

    // head recursion
    static boolean isPrime(int number, int check) {
        if(check==1)
        {
            return true;
        }
        boolean result =isPrime(number, check-1);
        if(result==false || number%check==0)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // checkPrime(6, 5);
        System.out.println(isPrime(5,4) == true?"prime":"not prime");   
    }
}
