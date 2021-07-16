import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        int num;
        //Taking input from Console
        //The input provided by user stored in num
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter an Integer Number:");
        num = Sc.nextInt();
        //If number id divisible by 2 then it's even no
        //else it's odd no
        if (num % 2 == 0) {
            System.out.println("The Entered Number is Even Number");
        } else {
            System.out.println("The Entered Number is Odd Number ");
        }


    }
}

