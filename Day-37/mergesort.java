import java.util.*;
public class Solution {
    public static void merge(int[] arr,int l,int mid,int r)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int i=l;
        int j=mid+1;
        while(i<=mid && j<=r)
        {
            if(arr[i]<=arr[j])
            {
                list.add(arr[i++]);
            }
            else
            {
                list.add(arr[j++]);
            }
        }
        while(i<=mid)
        {
             list.add(arr[i++]);
        }
        while(j<=r)
        {
            list.add(arr[j++]);
        }
        i=l;
        for(int a:list)
        {
            arr[i++]=a;
        }
    }
    public static void mergeSort(int[] arr, int l, int r){
        if(l<r)
        {
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }

    }
}
