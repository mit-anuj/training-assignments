public class rightPascalTrianglePattern {
    static void printStar(int index){
        if(index <= 0)
            return;
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
        printStar(index-1);
        if(index>0)
        System.out.println();
    }
    public static void main(String[] args) {
        printLine(5, 0);
    }
}
