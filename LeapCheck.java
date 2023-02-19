import java.util.Scanner;

public class LeapCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the year");
        int a = in.nextInt();
        if (a % 4 == 0) System.out.println("leap year ");
        else System.out.println("not a leap year");
    }
}
