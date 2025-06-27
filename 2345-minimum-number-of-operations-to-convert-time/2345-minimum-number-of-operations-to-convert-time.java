class Solution {
    public int convertTime(String current, String correct) {
        String[] time=current.split(":");
        int hour1=Integer.parseInt(time[0]);
        int min1=Integer.parseInt(time[1]);
        int total1=hour1*60+min1;
        time=correct.split(":");
         int hour2=Integer.parseInt(time[0]);
        int min2=Integer.parseInt(time[1]);
        int total2=hour2*60+min2;
        int difference=total2-total1;
        int ans=0;
        while(difference>0){
            if(difference>=60){
                ans+=difference/60;
                difference=difference%60;
            }
            else if(difference>=15&&difference<60){
                ans+=difference/15;
                difference=difference%15;
            }
            else if(difference<15&&difference>=5){
                ans+=difference/5;
                difference=difference%5;
            }
            else{
                ans+=difference;
                difference=0;

            }
        }



return ans;

        
    }
}