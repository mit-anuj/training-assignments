public class sumOfNNaturalNos {
    // tail recursion.
    static void calcSum(int number,int sum){
        if(number == 0){
            System.out.println(sum);
            return;
        }
        sum += number;
        calcSum(number-1, sum);
    }
    // head recursion
    static int calcSum(int number){
        if(number == 0){
            return 0;
        }
        int sum = calcSum(number-1);
        return sum + number;
    }
    public static void main(String[] args) {
        // calcSum(100, 0);
        System.out.println(calcSum(100));
    }
}
