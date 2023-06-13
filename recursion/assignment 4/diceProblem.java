import java.util.ArrayList;

public class diceProblem {
    static ArrayList<String> dice(int currentvalue, int endvalue) {
        if(currentvalue==endvalue){
            ArrayList<String> dice = new ArrayList<String>();
            dice.add("");
            return dice;
        }
        if(currentvalue>endvalue){
            return new ArrayList<String>();
        }
        ArrayList<String> finalResult = new ArrayList<String>();
        for (int i = 1; i <=6; i++) {

            ArrayList<String> result= dice(currentvalue + i, endvalue);
            for(String s : result){
                finalResult.add(s+i);
            }
        }
        return finalResult;
    }

    public static void main(String[] args) {
        System.out.println(dice(0, 10));
    }
}
