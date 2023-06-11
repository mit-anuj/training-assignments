public class decimalToBinaryCode {
    static int decimalToBinary(int num) {
        if (num == 0) {
            return 0;
        }
        // int quotient = num / 2;
        int remainder = num % 2;
        int result = 10 * decimalToBinary(num / 2) + remainder;
        return result;

    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(14));
    }

}