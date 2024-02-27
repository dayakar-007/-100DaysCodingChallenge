import java.util.*;
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        Arrays.sort(a);
        int max=1;
        int c=1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                continue;
            }
            if(a[i]+1==a[i+1])
            {
                c++;
                max=Math.max(max,c);
            }
            else
            {
                c=1;
            }

        }
        return max;

        }
}