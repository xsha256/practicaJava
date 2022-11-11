package ejercicioGetFactorial;
public class factorial {

    public  factorial(){

    }
    
    public static int getFactorial(int n){

        int factorial = 1;


        while (n != 0){

             factorial = factorial * n;
             System.out.println("valor de n: "  +n);
             System.out.println("valor de factorial: " +n);

             n--;

        }
        System.out.println("valor de factorial final: " + factorial);
        return factorial;

    }

    

}
