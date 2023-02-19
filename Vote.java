import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your age :");
        int a =  in .nextInt();
        System.out.println(Lim(a));

    }
    static String Lim(int a) {
        if (a >= 18) return "Eligible for Voting";
        else return "Not Eligible for Voting";
    }
}
