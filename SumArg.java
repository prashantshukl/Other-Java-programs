import java.util.Arrays;

import static java.lang.Integer.sum;

public class SumArg {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        changeval(arr);
        System.out.println(Arrays.toString( arr));
    }
    static void changeval(int[] num) {
        num[4]  = 909;
    }
}
