import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = "";
        int c = a.length();
        while (c > 0) {
            b = b + String.valueOf( a.charAt(c-1));
            c = c-1;
        }
        System.out.println(b);

    }
}
