import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number :");
        int a = in.nextInt();
        if (a < 0) System.out.println("Enter valid number !!");
        else System.out.println("Factorial is :"+fact(a));


    }
    static int fact(int num) {
        int ans = 1;
         if (num == 0) return 1;
        else {
            for (int i = 1; i <= num; i++) {
                ans*=i;
            }
            return ans;
        }

    }
}
