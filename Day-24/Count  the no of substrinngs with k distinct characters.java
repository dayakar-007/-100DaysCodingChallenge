public class Solution {

    public static int solution(String str,int k)
    {
    int n=str.length();
    int arr[]=new int[26];
    int f=0;
    int j=0;
    int c=0;
    for(int i=0;i<n;i++)
    {
        while(j<n && f<k)
        {
            arr[str.charAt(j)-'a']++;
            if(arr[str.charAt(j)-'a']==1) f++;
            j++;
        }
        
        if(f>=k)
        {
            c=c+n-j+1;
        }
        arr[str.charAt(i)-'a']--;
        if(arr[str.charAt(i)-'a']==0)
        {
            f--;
        }
    }
    return c;

    }
    public static int countSubStrings(String str, int k) {
        int ans= solution(str,k)-solution(str,k+1);
        return ans;
   
    }
}

