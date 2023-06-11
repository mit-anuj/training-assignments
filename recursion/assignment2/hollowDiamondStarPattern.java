public class hollowDiamondStarPattern {
    static void printStar(int star) {
        if (star == 0) {
            return;
        }
        System.out.print("*");
        printStar(star - 1);
    }

    static void printSpace(int space) {
        if (space == 0) {
            return;
        }
        System.out.print(" ");
        printSpace(space - 1);
    }

    static void printPattern(int rows, int n) {
        if (rows == 0) {
            return;
        }
        printStar(rows);
        printSpace(2 * (n - rows));
        printStar(rows);
        System.out.println();
        printPattern(rows - 1, n);
        printStar(rows);
        printSpace(2 * (n - rows));
        printStar(rows);
        System.out.println();
    }

    public static void main(String[] args) {
        printPattern(5, 5);
    }
}
