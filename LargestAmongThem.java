import java.util.Scanner;

public class LargestAmongThem {
    public static void main(String[] args) {
        int a, b, c, largest, temp;
        //Taking the input from the console
        //input store inside a b c
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no:");
        a = sc.nextInt();
        System.out.println("Enter the second no:");
        b = sc.nextInt();
        System.out.println("Enter the third no:");
        c = sc.nextInt();
        temp = a > b ? a : b;
        largest = c > temp ? c : temp;
        //printing largest no
        System.out.println("The largest no is:" + largest);
    }
}
