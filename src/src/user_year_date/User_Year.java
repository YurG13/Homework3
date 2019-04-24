package user_year_date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User_Year {
    private int age;

    public User_Year(int age) {
        this.age = age;
    }

    public void year() {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy");
        System.out.println(localDate.minusYears(age).format(dateTimeFormatter));
    }
}
