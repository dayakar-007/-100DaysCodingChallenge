public class Solution {
    public static int[] twoOddNum(int []arr){
        int xor=0;
        for(int i:arr)
        {
            xor=xor^i;
        }
        int setbit=0;
        for(int i=0;i<32;i++)
        {
            setbit=1<<i;
            if((setbit&xor)!=0)
            break;
        }
        int first=0;
        int sec=0;
        for(int i:arr)
        {
            if((setbit&i)==0)
            {
                first=first^i;
            }
            else
            {
                sec=sec^i;
            }
        }
    if(first>sec)
    {
    return new int[]{first,sec};
    }
    return new int[]{sec,first};

    }
   
}