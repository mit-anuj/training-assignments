public class addTwoArrays {
    public static void main(String[] args) {
        int[] arr2 = { 9, 4, 5 };
        int[] arr1 = { 4,5,6, 4, 5,6 };
        int rem = 0;
        String str = "";
        int len1 = arr1.length;
        int len2 = arr2.length;
        int shorterArray = len1 <= len2 ? len1 : len2;
        int diff = (int) Math.abs(len2 - len1);

        //!Addition
        if (len1 <= len2) {
            for (int i = shorterArray - 1; i >= 0; i--) {
                str = ((arr1[i] + arr2[i + diff] + rem) % 10) + str;
                rem = (rem + arr1[i] + arr2[i + diff]) / 10;
            }
            if (diff != 0) {
                for (int i = diff; i>=0; i--) {
                    str = ((arr2[i]+rem)%10) + str;
                    rem = ((arr2[i]+rem)/10);
                }
            }
            if(rem!=0){
                str = rem + str;
            }
        } else {
            for (int i = shorterArray - 1; i >= 0; i--) {
                str = ((arr2[i] + arr1[i + diff] + rem) % 10) + str;
                rem = (rem + arr2[i] + arr1[i + diff]) / 10;
            }
            if (diff != 0) {
                for (int i = diff-1; i>=0; i--) {
                    str = ((arr1[i]+rem)%10) + str;
                    rem = ((arr1[i]+rem)/10);
                }
            }
            if(rem!=0){
                str = rem + str;
            }
        }
        int dec = 0;
        //!subtraction
        if(len1<len2){
            for(int i = shorterArray - 1; i >= 0; i--){
                if((arr2[i+diff]-dec)>=arr1[i]){
                    str = (arr2[i+diff]-arr1[i]-dec) + str;
                    dec=0;
                }else{
                    str = ((arr2[i+diff]+10)-arr1[i]) + str;
                    dec = 1;
                }
            }
            for(int i = diff-1;i>=0;i--){
                if((arr2[diff]!=0)){

                }
                str = 
            }
        }
        else{
            for(int i = shorterArray - 1; i >= 0; i--){
                if((arr1[i+diff]-dec)>=arr2[i]){
                    str = (arr1[i+diff]-arr2[i]-dec) + str;
                    dec=0;
                }else{
                    str = ((arr1[i+diff]+10)-arr2[i]) + str;
                    dec = 1;
                }
            }
        }
        int []result = new int[str.length()];
        for(int i = 0 ; i <str.length(); i++) {
            result[i]= (int)(str.charAt(i))-'0';
        }
        for(int r: result){
            System.out.println(r);
        }
    }
}
