/**
 * Created by ana on 7/11/17.
 */
public class SumOfDigits {


    public static int dig(int n) {

        return n == 0 ? 0 : n % 10 + dig(n/10);
    }

    public static void main(String[] args) {

        System.out.println(dig(333));

    }
}
