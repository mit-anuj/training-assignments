public class pyramidPattern {
    static void printSpace(int index){
        if(index==0){
            return;
        }
        System.out.print(" ");
        printSpace(index-1);
    }
    static void printStar(int index){
        if(index==0){
            return;
        }else if(index>1){
        System.out.print("* ");
        }
        else{
            System.out.print("*");
        }
        printStar(index-1);
    }
    static void printLine(int number,int index){
        if(index>number){
            return;
        }
        printSpace(number-index);
        printStar(index);
        printSpace(number-index);
        System.out.println();
        printLine(number,index+1);
    }
    public static void main(String[] args) {
        printLine(6, 1);
    }
}
