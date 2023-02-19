import java.util.Scanner;

public class SumOfNat {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter n : ");
        int a = in.nextInt();
        if (a <= 0) System.out.println("Enter a Positive number !!");
        else System.out.println("The sum of first "+a+" natural numbers is : "+Sumofnum(a));

    }
    static int Sumofnum(int a) {
        int ans = 0;
        for (int i = 1; i <= a ; i++) {
            ans += i;
        }
        return ans;
    }
}
