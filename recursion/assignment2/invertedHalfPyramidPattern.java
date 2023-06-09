public class invertedHalfPyramidPattern {
    static void printLine( int index){
        if(index==0){
            return;
        }
        printStar( index);
        System.out.println();
        printLine(index-1);
    }

    static void printStar(int index){
        if(index==0){
            return;
        }
        System.out.print("*");
        printStar(index-1);
    }

    static void print(int index,int currentIndex){
        if(index==0){
            return;
        }
        System.out.print("*");
        print(index-1, currentIndex);
        System.out.println();
        print(currentIndex-1, currentIndex-1);
        System.exit(0);

    }
    public static void main(String[] args) {
        // printLine(5);
        print(5, 5);
    }
}
