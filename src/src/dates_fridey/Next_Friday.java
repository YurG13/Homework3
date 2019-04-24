package dates_fridey;

import java.time.format.DateTimeFormatter;

public class Next_Friday extends Day_Week{
    private String day;

    public Next_Friday() {
        this.day = dayWeek();
    }

    public int next_friday_num() {
        switch (day) {
            case "пт" :
              return 7;
            case "сб" :
                return 6;
            case "вс" :
                return 5;
            case "пн" :
                return 4;
            case "вт" :
                return 3;
            case "ср" :
                return 2;
            case "чт" :
                return 1;
        }
        return 0;
    }

    public void next_friday(int num) {
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.print(localDate.plusDays(num).format(dateTimeFormatter));
    }

}
