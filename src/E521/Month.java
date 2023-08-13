package E521;

public class Month {
    public int getLength(int month){
        int days=0;
        boolean isFebruary = month == 2;
        boolean isAprilJuneSepNov = month == 4 || month == 6 || month == 9 || month == 11 ;
        boolean isErrorMonth = month < 1 || month>12;

        boolean is30Days = isAprilJuneSepNov;
        boolean is31Days = !isFebruary && !isAprilJuneSepNov && !isErrorMonth;

        days =  isErrorMonth ? -1 :(isFebruary? 28 : (is30Days ? 30 :  31 ));

        return days;
    }
}
