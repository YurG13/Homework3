package leap_year;

public class Year_Leap {
    public boolean year_leap(int year) {
        if (year % 4 != 0) {
            return false;
        } else {
            return true;
        }
    }

}
