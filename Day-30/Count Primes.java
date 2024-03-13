import java.util.*;

public class Solution {
    public static void prim(boolean[] prime)
    {
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<prime.length;i++)
        {
            if(prime[i])
            {
                for(int j=i*i;j<prime.length;j=j+i)
                {
                    prime[j]=false;
                }
            }
        }
    }
    public static List< Integer > countPrimes(int n) {
        boolean[] prime=new boolean[n+1];
        prim(prime);
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(prime[i] && n%i==0)
            {
                ans.add(i);
            }
        }
        return ans;
    }
}
