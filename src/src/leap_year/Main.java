package leap_year;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Year_Leap year_leap = new Year_Leap();
        Scanner sc = new Scanner(System.in);
        boolean cont;

        System.out.print("Enter year : ");
        int year = sc.nextInt();

        cont = year_leap.year_leap(year);
        if (cont) {
            System.out.println("Year is a Leap");
        } else {
            System.out.println("Year is a not Leap");
        }
    }
}
