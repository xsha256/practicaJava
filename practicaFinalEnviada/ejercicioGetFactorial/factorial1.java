package ejercicioGetFactorial;
public class factorial1 {
        public  factorial1(){

        }
        
        public static double getFactorial(double n){

            double factorial = 1;


            while (n != 0){

                factorial = factorial * n;
                n--;

            }
            return factorial;

        }

       
        public static double getFactorial2(double numero) {
            if (numero==0)
              return 1;
            else
              return numero * getFactorial2(numero-1);
            
          }

         

    }
    


