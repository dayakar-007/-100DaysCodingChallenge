public class Solution {
    public static List< Integer > superiorElements(int []a) {
        List<Integer> ans=new ArrayList<>();
        int n=a.length;
        int leader=a[n-1];
        ans.add(leader);
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]>leader)
            {
                ans.add(a[i]);
                leader=a[i];
            }
        }
        Collections.sort(ans);
        return ans;
    }
}