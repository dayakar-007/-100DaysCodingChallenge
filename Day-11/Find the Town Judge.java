class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] arr1=new int[n+1];
        int arr2[]=new int[n+1];
        for(int[]a:trust)
        {
            arr2[a[0]]++;
            arr1[a[1]]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(arr1[i]==n-1 && arr2[i]==0) return i;
            
            
        }
        return -1;

    }
}