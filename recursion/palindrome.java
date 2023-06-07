public class palindrome {
    // tail recursion
    static void isPalindrome(String originalString, String name, String reverseString) {
        if (name.equals("")) {
            System.out.println(reverseString.equals(originalString) ? "Palindrome" : "Not Palindrome");
            return;
        }
        reverseString += name.charAt(name.length()-1);
        isPalindrome(originalString, name.substring(0,name.length()-1), reverseString);
    }

    // head recursion
    static String isPalindrome(String originalString) {
        if(originalString==""){
            return "";
        }
        String string= isPalindrome(originalString.substring(1));
        string= string + (originalString.charAt(0));
        return string;
    }
    public static void main(String[] args) {
        String name= "anuj";
        isPalindrome(name,name,"");
        // System.out.println(isPalindrome(name).equals(name)?"palindrome":"not Palindrome");

    }
}
