public class Solution {
    public static void selectionSort(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int min_idx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min_idx])
                {
                    min_idx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
        }
    
    }
}