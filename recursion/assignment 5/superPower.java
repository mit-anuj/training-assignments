public class superPower {
    
    int base = 1337;

    public int superPow(int a, int[] b) {
        return superPow(a, b, b.length-1);
    }

    public int superPow(int a, int[] b, int index) {
        if (index == 0)
            return pow(a, b[index]) % base;
        int pre = superPow(a, b, index-1);
        return (pow(pre, 10) * pow(a, b[index])) % base;
    }

    public int pow(int x, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x % base;
        int half = pow(x, n/2); 
        if(n%2==0)  
            return (half*half) % base;
        else  
            return (((half*half) % base) *(x % base)) % base; 
    }

    public static void main(String[] args) {
        int []arr ={1,0};
        superPower s = new superPower();
        System.out.println(s.superPow(2,arr));
    }
}
