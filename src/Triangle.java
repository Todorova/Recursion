/**
 * Created by ana on 7/12/17.
 */
public class Triangle {

    public static String triangle(int n) {

        if (n == 1)
            return "1";

        else
            return triangle(n - 1) + " " + n;
    }

    public static String triangle(int a, int b) {
        if (a == b)
            return triangle(b);

        else
            return triangle(a) + "\n" + triangle(a + 1, b);

    }

    public static void main(String[] args) {
        System.out.println(triangle(1, 17));
    }
}

