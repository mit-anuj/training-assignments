public class numberCharPattern {
    static int printChar(int index,int value){
        if(index<0){
            return value;
        }
        System.out.print(value+" ");
        value = printChar(index-1, value+1);
        return value;
    }
    static void printLine(int number,int index, int count){
        if(index>=number){
            return;
        }
        count = printChar(index, count);
        System.out.println();
        printLine(number, index+1, count);
    }
    public static void main(String[] args) {
        printLine(4,0,1);
    }
}
