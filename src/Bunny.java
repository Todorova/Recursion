/**
 * Created by ana on 7/7/17.
 */
public class Bunny {

    public static int Bunny (int n) {
        System.out.println(n + " bunnyta " +"with " + n*2 +" bunny ears" );
        if (n > 1) {
            return (Bunny(n-1));
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

       System.out.println(Bunny(5));
        System.out.println("I ate their ears, but I will eat yours as well");
    }
}
