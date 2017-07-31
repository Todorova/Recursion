/**
 * Created by ana on 7/7/17.
 */
public class One {


    public static int numbers(int n) {
        System.out.println(n);
        if (n > 1) {
            return (numbers(n-1));
        } else {
            return 0;
        }

    }


    public static void main(String[] args) {
        System.out.println(numbers(9));
    }
}


