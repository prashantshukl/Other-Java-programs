import java.util.Scanner;

public class Ass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter any number to start, 0 to exit :");
        int num = in.nextInt();
        int negsum = 0;
        int evensum = 0;
        int oddsum = 0;
        while (num != 0) {
            num = in.nextInt();
            if (num < 0) negsum +=num;
            if (num > 0) {
                if (num%2==0) {
                    evensum += num;
                } else oddsum += num;
            }

        }
        System.out.println("sum of negative numbers is :"+negsum);
        System.out.println("sum of odd numbers is :"+oddsum);
        System.out.println("sum of even numbers is :"+evensum);

    }
}
