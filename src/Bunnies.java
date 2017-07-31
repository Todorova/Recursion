/**
 * Created by ana on 7/7/17.
 */
public class Bunnies {


    public static int Bunnies(int n) {

        if (n > 0 && n % 2 == 0) {
            return 2+ Bunnies(n - 1);
        }
        if (n > 0 && n % 2 != 0) {
            return 3+ Bunnies(n - 1);

        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(Bunnies(2));

    }

}