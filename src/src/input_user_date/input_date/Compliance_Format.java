package input_user_date.input_date;

import java.sql.DatabaseMetaData;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.zip.DataFormatException;

public class Compliance_Format {
    private String format;
    private String date;
    public DateTimeFormatter FOMATTER;
    public LocalDate localDate;
    public LocalDate localDate2;

    public Compliance_Format(String format, String date) {
        this.format = format;
        this.date = date;
    }

    public boolean compliance() {
        FOMATTER = DateTimeFormatter.ofPattern(format);

        try {
            localDate = LocalDate.parse(date, FOMATTER);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public void difference() {
        localDate2 = LocalDate.now();
        Period isPeriod =  Period.between(localDate, localDate2);
        System.out.println("difference between dates will be " + isPeriod.getDays() +
                        " Day " + isPeriod.getMonths() + " Months " + isPeriod.getYears() + " Year");
    }
}
