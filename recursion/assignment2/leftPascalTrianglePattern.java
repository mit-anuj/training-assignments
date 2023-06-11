public class leftPascalTrianglePattern {
    static void printSpace(int index){
        if(index<=0){
            return;
        }
        System.out.print(" ");
        printSpace(index-1);
    }

    static void printStar(int index){
        if(index<0){
            return;
        }
        System.out.print("*");
        printStar(index-1);
    }
    static void printLine(int number,int index){
        if(index>=number){
            return;
        }
        printSpace(number-index-1);
        printStar(index);
        System.out.println();
        printLine(number, index+1);
        printSpace(number-index);
        printStar(index-1);
        System.out.println();
    }

    public static void main(String[] args) {
        printLine(5,0);
    }
}
