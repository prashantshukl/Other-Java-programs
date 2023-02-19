import java.util.Scanner;

public class FutInvVal {
    public static void main(String[] args) {
        // future value = present value * (1 + r)^n
        Scanner in = new Scanner(System.in);
        System.out.println("enter Principal Value :");
        int pv = in.nextInt();
        System.out.println("enter Rate :");
        int r = in.nextInt();
        System.out.println("enter Compounding period :");
        int n = in.nextInt();
        int ex = 0;
        ex += Math.pow(1+r, n);
        int ans = pv*ex;
        System.out.println("future investment value is :"+ ans);
    }
}
