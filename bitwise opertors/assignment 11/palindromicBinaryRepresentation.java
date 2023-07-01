public class palindromicBinaryRepresentation {
    int count = 0;
    boolean isPalindrome(String a){
        int low = 0;
        int high = a.length()-1;
        while(low < high){
            if(a.charAt(low)!=a.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        count++;
        return true;
    }
    String convertBinary(int a ){
        String result = "";
        while(a>0){
            result = a%2+result;
            a = a/2;
        }
        return result;
    }
    int solve(int a){
        int index = a/2;
        while(true){
            String binary = convertBinary(index);
            boolean result = isPalindrome(binary);
            if(result == true && count == a){
                return index;
            }
            index++;
        }
    }
    public static void main(String[] args) {
        palindromicBinaryRepresentation p = new palindromicBinaryRepresentation();
        System.out.println(p.solve(20000));
        // System.out.println(Integer.MAX_VALUE);

    }
}
