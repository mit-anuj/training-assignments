public class armstromgNo {
    static int calcLength(int number) {
        if (number == 0) {
            return 0;
        }
        int count = calcLength(number / 10);
        return count + 1;
    }

    // tail recursion.
    static void isArmstrong(int number, int newNumber, int sum, int lenght) {
        if (newNumber == 0) {
            System.out.println(sum == number ? "Armstrong" : "Not Armstrong");
            return;
        }
        int firstDigit = newNumber % 10;
        sum += Math.pow(firstDigit, lenght);
        isArmstrong(number, newNumber / 10, sum, lenght);
    }

    // head recursion.
    static int isArmstrong( int newNumber, int lenght) {
        if (newNumber == 0) {
            return 0;
        }
        int sum = isArmstrong(newNumber / 10, lenght);
        int firstDigit= newNumber % 10;
        sum += Math.pow(firstDigit, lenght);
        return sum;
    }

    public static void main(String[] args) {
        int number = 9474;
        // isArmstrong(number, number, 0, calcLength(number));
        System.out.println(isArmstrong(number, calcLength(number))==number?"Armstrong":"Not Armstrong");
    }
}
