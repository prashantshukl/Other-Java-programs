import java.util.Scanner;

public class LcmOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number 1 :");
        int a = in.nextInt();
        System.out.print("enter number 2 :");
        int b = in.nextInt();
        int lar;
        int ans = 1;
        if(a>b) lar = a;
        else lar = b;
        int i = 2;
        while (i <= lar) {
            if (a%i == 0 || b%i == 0) {
                ans = ans*i;
                if (a%i == 0) {
                    a = a/i;
                }  if (b%i == 0) {
                    b = b/i;
                }
            }
            else i++;
        }
        System.out.println(ans);
    }
}
