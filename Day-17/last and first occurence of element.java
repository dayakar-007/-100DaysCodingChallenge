import java.util.* ;
import java.io.*; 
public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int first=-1;
        int last=-1;
        int l=0;
        int h=n-1;
        //first
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr.get(mid)==k)
            {
                first=mid;
                h=mid-1;
            }
            else if(arr.get(mid)>k)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        l=0;
        h=n-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr.get(mid)==k)
            {
                last=mid;
                l=mid+1;
            }
            else if(arr.get(mid)>k)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        int[] ans={first,last};
        return ans;
    }

};
