import java.util.Scanner;

public class PrimeBTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number one :");
        int a = in.nextInt();
        System.out.print("enter number two :");
        int b = in.nextInt();
        if (a>=b) Prime(b,a);
        else Prime(a,b);

    }
    static void Prime(int a ,int b) {
        int num = a;
        boolean numprime = true;
        while (num<=b) {
            for (int i = 2; i*i <= num; i++) {
                if (num%i==0) {
                    numprime = false;
                    break;
                }
            }
            if (numprime) System.out.println(num);
            numprime = true;
            num++;

        }

    }
}
