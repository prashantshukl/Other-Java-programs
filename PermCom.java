import java.util.Scanner;

public class PermCom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n :");
        int n = in.nextInt();
        System.out.print("enter r :");
        int r = in.nextInt();
        int factn = fact(n);
        int facta = fact(n-r);
        int factb = fact(r);
        System.out.println("permutation is :" + factn/facta);
        System.out.println("combination is :" + factn/(facta*factb));
    }
    static int fact(int a) {
        int fac = 1;
        while (a>0) {
            fac *= a;
            a = a-1;
        }
        return fac ;
    }
}
