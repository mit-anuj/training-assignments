public class binaryToDecimalCode {
    static int binaryToDecimal(int num, int count) {
        if (num == 0) {
            return 0;
        }
        int bit = num % 10;
        int result = bit * (int) Math.pow(2, count) + binaryToDecimal(num / 10, count + 1);
        return result;
    }

    static int binaryToDecimal(int num) {
        return binaryToDecimal(num, 0);
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal(111));
    }

}
