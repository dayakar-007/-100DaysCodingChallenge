import java.util.*;
public class Solution {
    public static String commonPrefix(String []arr,int n){
        //Write your code her
        Arrays.sort(arr);
        String re="";
        String first=arr[0];
        String last=arr[n-1];
        int i=0;
        int j=0;
        while(i<first.length()&& j<last.length() && first.charAt(i)== last.charAt(j))
        {
            re+=first.charAt(i);
            i++;
            j++;

        }
        return re==""?"-1":re;

           
      }
}