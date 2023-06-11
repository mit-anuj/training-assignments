public class leftAndRightArrowPattern {
    static void printStars(int stars) {
        if (stars == 0) {
            return;
        }
        System.out.print("*");
        printStars(stars - 1);
    }

    static void printSpaces(int spaces) {
        if (spaces == 0) {
            return;
        }
        System.out.print(" ");
        printSpaces(spaces - 1);
    }

    static void printLines(int rows) {
        if (rows == 0) {
            return;
        }
        printSpaces(rows - 1);
        printStars(rows);
        System.out.println();
        printLines(rows - 1);
    }

    static void printLowerLines(int rows) {
        if (rows == 1) {
            return;
        }
        printLowerLines(rows - 1);
        printSpaces(rows - 1);
        printStars(rows);
        System.out.println();
    }

    public static void main(String[] args) {
        printLines(5);
        printLowerLines(5);
    }

}
