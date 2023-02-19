public class PrintArm {
    public static void main(String[] args) {
        Arm();
    }
    static void Arm() {
        int a = 100;
        int sum = 0;
        while (a < 1000) {
           int temp = a;
           while (temp > 0) {
               int rem = temp%10;
               sum = sum + rem*rem*rem;
               temp /= 10;
           }
           if (sum == a) {
               System.out.println(a);
           }
           a++;
            sum = 0;
       }
    }
}
