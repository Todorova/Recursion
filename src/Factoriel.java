/**
 * Created by ana on 7/6/17.
 */
public class Factoriel {


    public int factoriel(int n) {
        if (n == 1) {
            return 1;
        } else{
            return n*factoriel(n - 1);
        }
    }

    public static void main(String[] args) {
       // Scanner console = new Scanner(System.in);

        Factoriel fact = new Factoriel();
        System.out.println(fact.factoriel(5));
    }
}



