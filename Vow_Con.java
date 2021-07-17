import java.util.Scanner;

public class Vow_Con {
    public static void main(String[] args) {
        int i = 0;
        //Taking input from Console
        //inuput data stored in char ch
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch = sc.next().charAt(0);
        //if condition aeiou / AEIOU
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            //prints Vowel
            System.out.println("Entered character is vowel");
        }
        //else if A-Z /a-z
        else if ((ch >= 'A' && ch <= 'z') || (ch >= 'a' && ch <= 'z')) {
            //print consonant
            System.out.println(" entered Character is consonant");
        } else {
            System.out.println("Not a Alphabet");
        }

    }
}


