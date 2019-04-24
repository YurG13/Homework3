package user_year_date;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        User_Year user_year = new User_Year(age);

        System.out.print("Your birth year: ");
        user_year.year();
    }
}
