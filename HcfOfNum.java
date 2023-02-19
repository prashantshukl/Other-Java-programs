import java.util.Scanner;

public class HcfOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1 :");
        int a = in.nextInt();
        System.out.println("enter number 2 :");
        int b = in.nextInt();
        int ans = 1;
        int lar;
        if (a>b) lar = a;
        else lar = b;
        int i = 2;
        while ( i <= lar/2) {
            if (a%i == 0 && b%i == 0) {
                ans = ans*i;
                a = a/i;
                b = b/i;
            }
            else i++;
        }
        System.out.println("the hcf is :"+ ans);
    }
}
