import java.util.Scanner;

public class Swap_2_Num {
    public static void main(String[] args) {
        int x, y, z;
        //System input will taken through Console
        //input stored in x and y
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X and Y ");
        x = sc.nextInt();
        y = sc.nextInt();
        //Printing values before Swapping
        System.out.println("Before swapping no:" + x + "," + y);
        //swapping te values
        z = x;
        x = y;
        y = z;
        //Printing values after Swapping
        System.out.println("After Swapping:" + x + "," + y);

    }
}

