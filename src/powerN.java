/**
 * Created by ana on 7/11/17.
 */
public class powerN {

    public static int ny(int n, int y) {


        if (y == 0) {
            return 1;
        } else {
            return n * ny(n, y - 1);
        }

    }

    public static void main(String[] args) {

        System.out.println(ny(3, 2));

    }
}
