import java.util.ArrayList;
public class Solution {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        // Write you
        int l=0;
        int h=n-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr.get(mid)==k)return mid;
            if(arr.get(0)<=arr.get(mid))
            {
                if(arr.get(l)<=k && arr.get(mid)>k)
                {
                    h=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
            else{
                if(arr.get(mid)<k && arr.get(h)>=k)
                {
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
}