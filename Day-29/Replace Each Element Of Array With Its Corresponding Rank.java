import java.util.*;
public class Solution {
    public static List<Integer> replaceWithRank(List<Integer> arr, int n){
        List<Integer> arr1=new ArrayList<>(arr);
        Collections.sort(arr);
        Map<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int i:arr)
        {
            if(!map.containsKey(i))
            {
                map.put(i,rank++);
            }
        }
        int k=0;
        for(int i:arr1)
        {
            arr.set(k++,map.get(i));
        }
        return arr;
    }
}
