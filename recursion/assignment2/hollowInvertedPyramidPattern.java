public class hollowInvertedPyramidPattern {
    static void printSpace(int index){
        if(index<=0){
            return;
        }
        System.out.print(" ");
        printSpace(index-1);
    }
    static void printStar(int index){
        if(index<=0){
            return;
        }
        System.out.print("*");
        printStar(index-1);
    }
    static void printLine(int number,int index){
        if(index>=number){
            return;
        }
        printSpace(index);
        if(index==number || index==0){
            printStar(2*(number-index)-1);
        }else{
            printStar(1);
            if(index%2==1)
                printSpace(2*(number-index)-1);
            else
                printSpace(number-index-1);
            if(index!=number-1)
            printStar(1);
        }
        System.out.println();
        printLine(number, index+1);

    }
    public static void main(String[] args) {
        printLine(3, 0);
    }
}
