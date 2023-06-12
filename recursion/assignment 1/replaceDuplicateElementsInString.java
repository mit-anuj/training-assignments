public class replaceDuplicateElementsInString {
    // tail recursion.
    static void replaceDuplicate(String str,String newStr){
        if(str == ""){
            System.out.println(newStr);
            return;
        }
        if(newStr==""){
            newStr = newStr + str.charAt(0);
        }
        else if(newStr.charAt(newStr.length()-1)==str.charAt(0)){
            newStr = newStr + "#";
        }
        else{
            newStr = newStr + str.charAt(0);
        }
        replaceDuplicate(str.substring(1), newStr);
    }

    // head recursion.
    static String replaceDuplicate(String str){
        if(str == ""){
            return "";
        }
        String newStr= replaceDuplicate(str.substring(1));
        if(newStr==""){
            newStr= str;
        }
        else if(newStr.charAt(0)==str.charAt(0))
        {
            newStr= "#"+newStr;
        }
        else{
            newStr= str.charAt(0)+newStr;
        }
        return newStr;
    }
    public static void main(String[] args) {
        // replaceDuplicate("aabbcc", "");
        System.out.println(replaceDuplicate("aabbcc"));
        
    }
}
