import java.util.Scanner;

public class StarIncRev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a;
        String c = "*";
        for (int i = 0; i < a; i++) {
            for (int j = b-1; j > 0 ; j--) {
                System.out.print(" ");
            }
            System.out.println(c);
            c= c + "*";
            b--;
        }
    }
}
