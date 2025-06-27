import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class Solution {
    private int dayofyear(String date){
         LocalDate d = LocalDate.parse("2021-"+date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return d.getDayOfYear();
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int ast=dayofyear( arriveAlice);
        int aend=dayofyear( leaveAlice);
        int bst=dayofyear( arriveBob);
        int bend=dayofyear( leaveBob);
       ast=Math.max(ast,bst);
       aend=Math.min(aend,bend);
       if(aend<ast) return 0;
       int ans=(aend-ast+1);
       return ans;
    }
}