class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int year1=Integer.parseInt(date1.split("-")[0]);
        int month1=Integer.parseInt(date1.split("-")[1]);
        int day1=Integer.parseInt(date1.split("-")[2]);
        int year2=Integer.parseInt(date2.split("-")[0]);
        int month2=Integer.parseInt(date2.split("-")[1]);
        int day2=Integer.parseInt(date2.split("-")[2]);
        int total1=day1;
        for(int i=1971;i<year1;i++)
        {
            total1+=numberofdays(i,12);
        }
        total1+=numberofdays(year1,month1-1);
        int total2=day2;
        for(int i=1971;i<year2;i++)
        {
            total2+=numberofdays(i,12);
        }
        total2+=numberofdays(year2,month2-1);
        return Math.abs(total1-total2);
        
    }
    public int numberofdays(int year,int month)
    {
        int days=0;
        boolean leap=isleap(year);
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,31);
        map.put(2,leap?29:28);
        map.put(3,31);
        map.put(4,30);
        map.put(5,31);
        map.put(6,30);
        map.put(7,31);
        map.put(8,31);
        map.put(9,30);
        map.put(10,31);
        map.put(11,30);
        map.put(12,31);
        for(int i=1;i<=month;i++)
        {
            days+=map.get(i);
        }
        return days;
    }
    public boolean isleap(int year)
    {
        if(year%400==0) return true;
        if(year%100==0) return false;
        if(year%4==0) return true;
        return false;
    }
}