public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        int l=0;
        int h=n-1;
        int low=n;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]>=x)
            {
                low=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
    }
    return low;
    }
}