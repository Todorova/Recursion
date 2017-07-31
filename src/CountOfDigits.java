/**
 * Created by ana on 7/11/17.
 */
public class CountOfDigits {

    public static int countd(int n) {
        if (n < 10) return n==8 ? 1 : 0;
        if (n % 100 == 88) return 2 + countd(n/10);
        else if (n % 10 == 8) return 1 + countd(n/10);
        else return countd(n/10);
    }

    public static void main(String[] args) {

        System.out.println(countd(1818818));

    }
}
