public class Solution {
    public static int xor(int x)
    {
        if(x%4==0) return x;
        if(x%4==1) return 1;
        if(x%4==2) return x+1;
        return 0;
    }
    public static int findXOR(int L, int R){
        return xor(L-1)^xor(R);
    }
}
