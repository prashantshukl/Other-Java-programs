import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number :");
        int a = in.nextInt();
        int sum = 0;
        while (a > 0) {
            int rem = a%10;
            sum += rem;
            a /= 10;
        }
        System.out.println("sum of digits is :"+ sum);
    }
}
