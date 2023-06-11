public class arrayWordsCapatialized {
    static String[] capatial(String []words, int arrIndex, int stringIndex, int count){
        if(arrIndex==words.length){
            return new String[count];
        }
        String result[] = capatial(words, arrIndex+1, stringIndex, count+1);

    }
    public static void main(String[] args) {
        
    }
}
