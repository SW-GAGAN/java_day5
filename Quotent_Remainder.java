import java.util.Scanner;

public class Quotent_Remainder {
    public static void main(String[] args) {
        int num1, num2, Quotient, Remainder;
        // Taking input from console
        //input Stored in num1 and num2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 and num2");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        //quotient is num1 / num2
        Quotient = num1 / num2;
        //remainder is num1 % num2
        Remainder = num1 % num2;
        System.out.println("Quotient is :" + Quotient);
        System.out.println("Remainder is:" + Remainder);
    }
}

