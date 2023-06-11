public class crossDiagonalLinePattern {
    static int printSpace(int index, int count) {
        if (index <= 0) {
            return count;
        }
        // count=count+1;
        System.out.print(" ");
        count = printSpace(index - 1, count+1);
        return count+1;
    }

    static void printLine(int number, int index) {
        if (index > number) {
            return;
        }
        printSpace(index - 1, 0);
        System.out.print("*");
        int count = printSpace(number - (index * 2), 0);
        if (count / 2 > 0)
            System.out.print("*");
        printSpace(index - 1, 0);

        System.out.println();
        printLine(number, index + 1);
        System.exit(0);
    }

    public static void main(String[] args) {
        printLine(5, 1);
    }
}
