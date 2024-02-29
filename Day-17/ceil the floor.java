import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      int ans[]={n,n};
      int floor=-1;
      int ceil=-1;
      int l=0;
      int h=n-1;
      while(l<=h)
      {
        int mid=(l+h)/2;
        if(a[mid]<=x)
        {
          floor=a[mid];
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
        if(a[mid]<x)
        {
          
          l=mid+1;
        }
        else
        {
          ceil=a[mid];
          h=mid-1;
        }
      }
      ans[0]=floor;
      ans[1]=ceil;
      return ans;
    }
    
}