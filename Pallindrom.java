import java.util.Scanner;

public class Pallindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number :");
        int num = in.nextInt();
        if (Pall(num)) System.out.println("pallindrom");
        else System.out.println("not pallindrom");
    }
    static boolean Pall(int a) {
        boolean ans2 = true;
        int temp = a;
        int ans = 0;
        while (temp > 0) {
            int rem = temp%10;
            ans = ans*10 + rem;
            temp /= 10;
        }
        if (a == ans ) ans2 = true;
        else ans2 = false;
        return ans2;
    }
}
