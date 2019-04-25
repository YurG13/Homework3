package input_user_date;

import input_user_date.input_date.Compliance_Format;
import input_user_date.validation_format.Validation_Date_Format;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Types of format \nyyyy-MM-dd, \ndd-MMM-yyyy, \ndd/MM/yyyy, \nyyyy MMM dd," +
                "\nInput Format :");
        String format = sc.nextLine();
        String date;

        Validation_Date_Format validation_date_format = new Validation_Date_Format(format);


        while (!validation_date_format.format_date()) {
            System.out.print("Format is wrong. type the right form : ");
            format = sc.nextLine();
            validation_date_format = new Validation_Date_Format(format);
        }

        System.out.print("Input date appropriating with format : ");
        date = sc.nextLine();
        Compliance_Format compliance_format = new Compliance_Format(format, date);

        compliance_format.compliance();

        while (!compliance_format.compliance()) {
            System.out.print("data is wrong try again : ");
            date = sc.nextLine();
            compliance_format = new Compliance_Format(format, date);
            compliance_format.compliance();
        }

        compliance_format.difference();
    }
}
