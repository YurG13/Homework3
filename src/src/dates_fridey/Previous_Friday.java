package dates_fridey;

import java.time.format.DateTimeFormatter;

public class Previous_Friday extends Day_Week {
    private String day;

    public Previous_Friday() {
        this.day = dayWeek();
    }

    public int previous_friday_num() {
        switch (day) {
            case "пт" :
                return 7;
            case "сб" :
                return 1;
            case "вс" :
                return 2;
            case "пн" :
                return 3;
            case "вт" :
                return 4;
            case "ср" :
                return 5;
            case "чт" :
                return 6;
        }
        return 0;
    }

    public void previous_friday(int num) {
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print(localDate.minusDays(num).format(dateTimeFormatter));
    }
}
