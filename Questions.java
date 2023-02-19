import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        IsPrime(num);

    }
    static void IsPrime(int num) {
        int rem = 2;
        while (true) {
            if (num%rem == 0) {
                System.out.println("not prime");
                break;
            } else if (rem <= num/2) {
                rem++;
            }
            else {
                System.out.println("prime");
                break;
            }
        }
    }

}
