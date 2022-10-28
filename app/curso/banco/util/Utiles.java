package app.curso.banco.util;

import java.util.Random;

public class Utiles {

        public static final String [] NOMBRES = {"Juan", "Edu", "Sergi", "Ana", "Rafa", "Adriana", "Javi", "Pepe", "Juan", "Juanjo", "Jose", "Eva" };
        public static final String [] APELLIDOS = {"Suarez", "Sanchez", "Chaquet", "Amri", "Peris", "Climent", "Terol", "Molla", "Morata", "Navarra"};

        public static String NombreApellidoAleatorio(String[] nombres, String[] apellidos){

            Random random = new Random();
            
            int indexNombre = random.nextInt(nombres.length);
            String nombreAleatorio = nombres[indexNombre];

            int indexApellido = random.nextInt(apellidos.length);
            String appellidoAleatorio = apellidos[indexApellido];

            String nombreCompleto = nombreAleatorio + " "+ appellidoAleatorio;

            return nombreCompleto;
        
    }

    public static String NombreAleatorio(){
        return NombreApellidoAleatorio(NOMBRES, APELLIDOS);
    }
    
}
