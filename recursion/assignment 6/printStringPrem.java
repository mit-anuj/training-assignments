public class printStringPrem {
    static void printPrem(String str, String word) {
        if (str.length() == 0) {
            System.out.println(word);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String rem=str.substring(0,i)+str.substring(i+1);
            printPrem(rem, word+ch);
        }
    }

    public static void main(String[] args) {
        printPrem("abc", "");
    }
}