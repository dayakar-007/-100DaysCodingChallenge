public class Solution {
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int l=0;
        int h=n-1;
        int first=-1;
        int last=-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]==x)
            {
                first=mid;
                h=mid-1;
            }
            else if(arr[mid]<x)
            {
                l=mid+1;                     
                      
            }
            else
            {
                h=mid-1;
            }

        }
        l=0;
        h=n-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(arr[mid]==x)
            {
                last=mid;
                l=mid+1;
            }
            else if(arr[mid]<x)
            {
                l=mid+1;                     
                      
            }
            else
            {
                h=mid-1;
            }

        }
        if(first==-1)return 0;
        return  last-first+1;
    
    
    }
}