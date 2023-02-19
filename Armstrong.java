import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//325
        int a = in.nextInt();
        System.out.println(isbahubali(a));
    }
    static boolean isbahubali(int num){
        int temp = num;
        int sum = 0;
        int temp2 = num;
        int count = 0;
        while (temp2 > 0) {
            count++;
            temp2 /= 10;
        }
        while (num > 0) {
            int rem = num%10;//5
            int ans = 1;
            int count2 = count;//3
            while (count2 != 0){
                ans *= rem;//5
                count2 = count2 - 1;//2
            }
            num /= 10;//32
            sum = sum + ans;

        }
        if (sum == temp) {
            return true;
        }
        else {
            return false;
        }
    }
}
