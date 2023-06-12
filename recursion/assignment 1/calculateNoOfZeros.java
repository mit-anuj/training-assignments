public class calculateNoOfZeros {
    // tail recursion.
    static void noOfZeros(int number, int count) {
        if (number == 0) {
            System.out.println(count + 1);
            return;
        }
        if (number > 0 && number <= 9) {
            System.out.println(count);
            return;
        }
        if (number % 10 == 0) {
            count++;
        }
        noOfZeros(number / 10, count);// recursive call
    }

    // head recursion.
    static int noOfZeros(int number) {
        if (number == 0) {
            return 1;
        }
        if (number > 0 && number <= 9) {
            return 0;
        }
        int count = noOfZeros(number / 10);
        if (number % 10 == 0) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // noOfZeros(0, 0);
        System.out.println(noOfZeros(102030));
    }
}
