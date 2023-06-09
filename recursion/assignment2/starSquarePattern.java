//star square pattern
public class starSquarePattern {
    static void printStar(int number, int index) {
        if (index == 0) {
            return;
        }
        System.out.print("*");
        printStar(number, index - 1);
    }

    static void printLine(int number, int index) {
        if (index == 0) {
            return;
        }
        printStar(number, number);
        System.out.println();
        printLine(number, index - 1);
    }


    static void printStar(int number, int index1, int index2) {
        if(index1 ==number || index2==0){
            return;
        } 
        System.out.print("*");
        printStar(number, index1+1, index2);
        System.out.println();
        printStar(number, 0, index2-1);
        System.exit(0);
    }
    public static void main(String[] args) {
        int number = 5;
        // printLine(number, number);
        printStar(number, 0,number);
    }
}
