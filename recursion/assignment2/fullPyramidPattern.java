public class fullPyramidPattern {
    static void printSpace(int index) {
        if (index == 0) {
            return;
        }
        System.out.print(" ");
        printSpace(index - 1);
    }

    static void printStar(int index) {
        if (index <= 0) {
            return;
        }
        if (index == 1)
            System.out.print("*");
        else {
            System.out.print("* ");
        }
        printStar(index - 1);
    }

    static void printLine(int number, int index) {
        if (index > number) {
            return;
        }
        if (number == 1) {
            printSpace(index);
            printStar(index);
            printSpace(index);
        } else {
            printSpace(2 * (number - index));
            printStar((2 * index) - 1);
            printSpace(2 * (number - index));
        }
        System.out.println();
        printLine(number, index + 1);
        // System.exit(0);
        printSpace(2 * (number - index +1));
        printStar((2 * (index-1)) - 1);
        printSpace(2 * (number - index+1));
        System.out.println();
    }

    public static void main(String[] args) {
        printLine(3, 1);
    }
}
