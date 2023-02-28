import java.util.Scanner;

public class StarInc {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        int a = in.nextInt();
        String b = "*";
        for (int i = 0; i < a; i++) {
            System.out.println(b);
            b = b+"*";
        }
    }
}
