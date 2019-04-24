package dates_fridey;

public class Main {
    public static void main(String[] args) {
        Next_Friday nFriday = new Next_Friday();
        Previous_Friday pFriday = new Previous_Friday();

        int nextNum, previousNum;

        nextNum = nFriday.next_friday_num();
        System.out.print("Previous Friday : ");
        previousNum = pFriday.previous_friday_num();


        nFriday.next_friday(nextNum);
        System.out.println();
        System.out.print("Next Friday : ");
        pFriday.previous_friday(previousNum);

    }
}
