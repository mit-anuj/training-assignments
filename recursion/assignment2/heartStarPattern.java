public class heartStarPattern {
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

    static void printLines(int rows, int stars) {
        if (rows == 0) {
            return;
        }
        printSpaces(rows - 1);
        printStars(2 * stars - 1);
        printSpaces(rows + 1);
        printSpaces(rows - 1);
        printStars(2 * stars - 1);
        System.out.println();
        printLines(rows - 1, stars + 1);
    }

    static void printLowerLines(int rows, int stars) {
        if (rows == 0) {
            return;
        }
        printLowerLines(rows - 1, stars + 1);
        printSpaces(rows - 1);
        printStars(2 * stars - 1);
        System.out.println();
    }

    public static void main(String[] args) {
        printLines(3, 3);
        printLowerLines(10, 1);
    }

}
