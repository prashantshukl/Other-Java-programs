import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("**********");
        }
    }
}
