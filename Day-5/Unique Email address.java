class Solution {
    public int numUniqueEmails(String[] emails) {
        int v[]=new int[emails.length];
        // int i=1;
        int j=0;
        Map<String,Integer> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        int r=0;
        for(String str:emails)
        {
            String x=str.split("@")[0];
            int i=x.indexOf("+");
            if(i!=-1)
            {
            x=str.substring(0,i).split("@")[0];
            }
            x=x.replaceAll("[.]","");
             String re=x+"@"+str.split("@")[1];
             set.add(re);
        }
        return set.size();
        
    }
}