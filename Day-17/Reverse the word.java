class Solution {
    public String reverseWords(String s) {
        String r[]=s.split(" +");
        String re="";
        for(String a:r)
        {
            re=a+" "+re;
        }
        return re.trim();
    }
}