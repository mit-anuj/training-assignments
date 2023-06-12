public class calculateSumOfSeries {
    // tail recursion.
    static void calcSum(int number, double sum){
        if(number==0){
            System.out.println(sum);
            return ;
        }
        sum += number/((Math.pow(number,number)));
        calcSum(number-1,sum);

    }

    // head recursion.
    static double calcSum(int number){
        if(number==0){
            return 0;
        }
        double sum = calcSum(number-1);
        sum += number/((Math.pow(number,number)));
        return sum;
    }
    public static void main(String[] args) {
        // calcSum(2, 0);
        System.out.println(calcSum(2));
    }
}
