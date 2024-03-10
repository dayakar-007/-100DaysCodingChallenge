
public class Solution {

     public static boolean isPrime(int i,int j,String s){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
     public static int minCharsforPalindrome(String s) {
        int n=s.length();
        int j=n-1;
        while(j>=0){
            if(s.charAt(0)==s.charAt(j)){
                if(isPrime(0,j,s)==true){
                    break;
                }
            }
            j--;
        }
        return n-j-1;
     }

}