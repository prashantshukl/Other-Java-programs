import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number :");
        int a = in.nextInt();
        System.out.println("The number is prime :"+Isprime(a));

    }
    static boolean Isprime(int a) {
        int num = a;
        boolean ans = true;
        for (int j = 2; j*j <= num ; j++) {
            if (num%j == 0) {
                 ans = false;
                break;
            }
        }
        return ans;
    }
}
