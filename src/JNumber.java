/**
 * Created by ana on 7/12/17.
 */
public class JNumber {

    public static String jnumbers(int n){
        if (n % 2 ==0){
            return ("not simple");
        } else if (n % 2 != 0 &&n/n == 1 && n/1==n){
            return ("simple");
        }
        return null;
    }

    public static void main(String[] args) {

        System.out.println(jnumbers(101));

    }
}
