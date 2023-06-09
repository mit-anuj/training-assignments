public class leftPyramidPattern {
    static void printStar( int index){
        if(index == 0){
            return;
        }
        System.out.print("*");
        printStar(index-1);
    }
    static void printLine(int number,int index){
        if(index>number){
            return;
        }
        printStar(index);
        System.out.println();
        printLine(number, index+1);
    }

    static void print(int number, int index,int currentIndex){
        if(index==0 || index>number){
            return;
        }
        System.out.print("*");
        print(number,index-1,currentIndex);
        System.out.println();
        print(number, currentIndex+1,currentIndex+1);
        System.exit(0);
    }
    public static void main(String[] args) {
        // printLine(5, 1);
        print(5,1,1);
    }
}
