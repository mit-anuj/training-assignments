public class oddStarPyramidPattern {
    static void printSpace(int index){
        if(index<=0){
            return ;
        }
        System.out.print(" ");
        printSpace(index-1);
    }
    static void printStar(int index){
        if(index<=0){
            return;
        }
        else if(index==1)
            System.out.print("*");
        else{
            System.out.print("* ");
        }
        printStar(index-1);
    }
    static void printLine(int number, int index){
        if(index>number){
            return;
        }
        else if(number==1){
            printSpace(index);
            printStar(index);
            printSpace(index);
        }
        else {
            printSpace((2*(number-index)));
            printStar((2*(index))-1);
            printSpace((2*(number-index)));
        }
        
        System.out.println();
        printLine(number, index+1);
        System.exit(0);
    }
    public static void main(String[] args) {
        printLine(1, 1);
    }
}
