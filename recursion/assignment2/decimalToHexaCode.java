public class decimalToHexaCode {
    static void decimalToHexa(int num, StringBuilder result) {
        if (num == 0) {
            System.out.println(result.reverse());
            return;
        }
        int rem = num % 16;
        if (rem >= 10) {
            result.append((char) (rem - 10 + 97));
        } else {
            result.append(rem);
        }
        decimalToHexa(num / 16, result);
    }

    static void decimalToHexa(int num) {
        decimalToHexa(num, new StringBuilder(""));
    }

    public static void main(String[] args) {
        decimalToHexa(590);
    }

}
