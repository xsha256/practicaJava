import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ArrayListTest {
    public static void main(String[] args){

        // // Array list 
        // ArrayList<Integer>; 

        // // Crear una lista
        // ArrayList<Integer> list = new ArrayList<Integer>();
       
        // // Añadir elemento  al final
        // list.add(1); 

        // // Tamaño de la list
        // list.size();

        // // Añadir numero 5 en la posicion 2
        // list.add(2, 5);

        // // Eliminar elemento 
        // list.remove(2);

        // // buscar elemento (si no esta devuelve -1)
        // list.indexOf(2);

        // Sacar elemento del array
        //  list.get(0);

        //// para crear un array de tipo string
        // ArrayList<String> lista = new ArrayList<>();

        //// para añadir elementos a un array de tipo string
        // listaString.add("Un string");

        //todo: crear un arraylist de numeros enteros del 0 al 20 añadiendo cada elemento en su posicion
        ArrayList<Integer> list = new ArrayList<>();

        // * crear el ArrayList 
        for (int i = 0; i <= 20; i++) {
            // añadir en la posicion i el numero i 
            list.add(i, i);
         }
         // * Mostrar el ArrayList
        System.out.println("\n"+list+"\n");

         // * añadir elemento 30 en la posicion 21
    //    list.add(21, 30);

       // * Mostrar el ArrayList
       System.out.println("\n"+list+"\n");

         // * mostar el elemento 10
       System.out.println(list.get(10));

        // * mostar el tamaño del Array 1
       System.out.println(list.size() + "\n");

         // * iterar Arraylist sin tener en cuenta posicion
         for(Integer numero : list){
            System.out.println(numero);
         }


       System.out.println("++++++++++++++++++++++++ HashMap ++++++++++++++++++++++++++++++++");

       // nuevo HashMap con clave Integer y Valor String
         HashMap<Integer, String> mapa = new HashMap<>();

         //* añadir el id y el elemento
         mapa.put( 1 , "Paco");
         mapa.put( 2 , "Juan");
         mapa.put( 3 , "Ana");
         mapa.put( 4 , "Carla");



         //* Mostrar el elemento por el id
         mapa.get( 1);
         

         // * iterar Arraylist tipo String
         mapa.forEach((clave, valor) ->{
            System.out.println("En la posicion: " + clave + " hay " + valor);
         });

         //* Mostrar el elemento  por el id
         System.out.println(mapa.get(4));

        //* Sobreescribir el elemento  
         mapa.put( 2 , "Rafa");

           //* Mostrar el elemento  por el id
           System.out.println(mapa.get(2));

           //* eliminar un elemento por id
           System.out.println("Eliminando a Rafa");
           mapa.remove(2);
         System.out.print("Rafa ha sido eliminado: ");

         //* Mostrar el elemento  por el id
         System.out.println(mapa.get(2));

         //* eliminar todos los elementos
         System.out.println("Eliminando todos los elementos");
         mapa.clear();
         System.out.print("Todos los elementos han sido eliminados: ");

         //* Mostrar el elemento  por el id
         System.out.println(mapa.get(2));


         //! Random numbers 
       Random random = new Random();
       int enterAleatorio = random.nextInt(100, 300);
       System.out.println("Aleatorio: " + enterAleatorio);

       double enterAleatorio1 = random.nextDouble(100, 150.50);
       System.out.println("Aleatorio: " + enterAleatorio1);

       boolean booleano = random.nextBoolean();
       System.out.println("Aleatorio: " + booleano);

      //  ArrayList<String> nombres = new ArrayList<>();



       //! Selecionar nombre y apellido random de la lista ++++++++++++++++++++++++++++++++++++++++++++++++++++

       for (int i = 0; i < 30; i ++) {
              String [] nombres = {"Juan", "Edu", "Sergi", "Ana", "Rafa", "Adriana", "Javi", "Pepe", "Juan", "Juanjo", "Jose", "Eva" };
              String [] apellidos = {"Suarez", "Sanchez", "Chaquet", "Amri", "Peris", "Climent", "Terol", "Molla", "Morata", "Navarra"};

            int indexNombre = random.nextInt(nombres.length);
            String nombreAleatorio = nombres[indexNombre];

            int indexApellido = random.nextInt(apellidos.length);
            String appellidoAleatorio = apellidos[indexApellido];

            System.out.println("Nombre y apellido:  " + nombreAleatorio + " "+ appellidoAleatorio);
       }
     //!+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
      



}
}
