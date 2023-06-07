public class powerOfaNumber{
    //tail recursion
    static void calcPower(int number,int power, int result){
        if(power==0){
            System.out.println(result);
            return;
        }
        result=result*number;
        calcPower(number, power-1, result);
    }

    // head recursion
    static int calcPower(int number,int power){
        if(power==0){
            return 1;
        }
        int result= calcPower(number, power-1);
        return result*number;
    }
    public static void main(String[] args) {
        //calls the first method.
        // calcPower(2,5,1);
        System.out.println(calcPower(2, 5));
    }   
}