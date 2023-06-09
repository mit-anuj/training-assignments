public class hollowStarSquarePattern {

    static void printStar(int number, int index,int line){
        if(index== number){
            return;
        }
        if(line == number || line ==1 ){
            System.out.print("*");
        }
        else if(index==0 || index==number-1){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        printStar(number, index+1,line);
    }

    static void printLine(int number,int index)
    {
        if(index== 0){
            return;
        }
        printStar(number,0,index);
        System.out.println();
        printLine(number, index-1);
    }

    static void printStarOneRecursiveCall(int number,int index1, int index2){
        if(index1==0 || index2==number){
            return;
        }
        if(index1==number || index1==1){
            System.out.print("*");
        }else if(index2==number-1 || index2==0){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
        printStarOneRecursiveCall(number, index1, index2+1);
        System.out.println();
        printStarOneRecursiveCall(number, index1-1, 0);
        System.exit(0);
    }
    public static void main(String[] args) {
        // printLine(5, 5);
        printStar(5,5,0);
    }
    
}
