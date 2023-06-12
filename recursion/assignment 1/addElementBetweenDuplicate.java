public class addElementBetweenDuplicate {
    // tail recusion.
    static void addElement(String str, String newStr){
        if(str==""){
            System.out.println(newStr);
            return;
        }
        if(newStr==""){
            newStr= newStr+ str.charAt(0);
        }
        else if(newStr.charAt(newStr.length()-1)==str.charAt(0)){
        newStr= newStr+"*"+str.charAt(0);
        }else{
            newStr= newStr+str.charAt(0);
        }
        addElement(str.substring(1), newStr);
    }

    // head recusion.
    static String addElement(String str){
        if(str==""){
            return "";
        }
        String newStr = addElement(str.substring(1));
        if(newStr==""){
            newStr= str;
        }
        else if(newStr.charAt(0)==str.charAt(0)){
            newStr= str.charAt(0)+"*"+newStr;
        }
        else{
            newStr= str.charAt(0)+newStr;
        }
        return newStr;
    }
    public static void main(String[] args) {
        // addElement("aabbcc", "");
        System.out.println(addElement("aabbcc"));
    }
}
