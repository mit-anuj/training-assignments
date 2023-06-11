public class invertedPyramidStarPattern {
    static void printStar(int index){
        if(index<=0){
            return;
        }
        if(index==1){
            System.out.print("*");
        }
        else{
            System.out.print("* ");
        }
        printStar(index-1);
    }
    static void printSpace(int index){
        if(index<=0){
            return;
        }
        System.out.print(" ");
        printSpace(index-1);
    }
    static void printLine(int number,int index){
        if(index>=number){
            return;
        }
        printSpace(2*index);
        printStar(2*(number-index)-1);
        printSpace(2*index);
        System.out.println();
        printLine(number, index+1);
    }
    public static void main(String[] args) {
        printLine(4, 0);
    }
}
