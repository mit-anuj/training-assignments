public class diagonalLinePattern {
    static void printSpace(int index){
        if(index==0){
            return;
        }
        System.out.print(" ");
        printSpace(index-1);
    }
    static void printLine(int number,int index){
        if(index>number){
            return;
        }
        printSpace(number-index);
        System.out.print("*");
        printSpace(number-index);
        System.out.println();
        printLine(number, index+1);
    }
    public static void main(String[] args) {
        printLine(4, 1);
    }
}
