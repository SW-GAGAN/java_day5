import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        //System input will be taken through console
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Year -> Year Must Be in YYYY Format");
        int year = s.nextInt();
        boolean flag = false;
        //if a year is multiple of 400
        //Then it is leap year
        if (year % 400 == 0) {
            flag = true;
        }
        //else if a year is multiple of 100
        //then the year is not a leap year
        else if (year % 100 == 0) {
            flag = false;
        }
        //else if  a year is multiple of 4
        //then is a leap year
        else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        if (flag) {
            System.out.println("Year" + year + " is a leap year");
        } else
            System.out.println("Year" + year + "is Not a leap Year");
    }
}
