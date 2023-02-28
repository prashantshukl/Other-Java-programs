import java.util.Scanner;

public class StarIncMid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String c = "*";
        int ac = a;
        int ab = 0;
        for (int i = 1; i <= a; i++) {
            int d = (2*i)-1;
            int kl = (ac*2)-1;
            int b = (kl-1)/2;
            for (int j = b; j >=0  ; j--) {
                System.out.print(" ");
            }

            System.out.print(c);

            for (int k = b; k >= 0 ; k--) {
                System.out.print(" ");
            }
            while (ab <= d) {
                c = c + "*";
                ab++;
            }
            System.out.println();
            ac--;
        }
    }
}
