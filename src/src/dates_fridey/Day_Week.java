package dates_fridey;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Day_Week {
    public LocalDate localDate = LocalDate.now();
    public DateTimeFormatter dateTimeFormatter;

    public String dayWeek() {
        dateTimeFormatter = DateTimeFormatter.ofPattern("E");
        String day = localDate.format(dateTimeFormatter);

        return day;
    }
}
