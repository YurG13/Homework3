package input_user_date.validation_format;


public class Validation_Date_Format extends Format_Array {
    String formatDate;

    public Validation_Date_Format(String formatDate) {
        this.formatDate = formatDate;
    }

    public boolean format_date() {
        for (String format : formatDate()) {
            if (format.equals(formatDate)) {
                return true;
            }
        }
        return false;
    }
}
