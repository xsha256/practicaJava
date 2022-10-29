package app.curso.banco.util;

import java.util.Random;

public class Utiles {

        public static final String [] NOMBRES = {"Juan", "Edu", "Sergi", "Ana", "Rafa", "Adriana", "Javi", "Pepe", "Juan", "Juanjo", "Jose", "Eva" };
        public static final String [] APELLIDOS = {"Suarez", "Sanchez", "Chaquet", "Amri", "Peris", "Climent", "Terol", "Molla", "Morata", "Navarra"};
        public static final String [] TELEFONO = {"+34 456 65 65 43", "+34 446 35 63 43", "+34 456 65 65 32", "+44 454 65 65 43", "+33 443 75 65 43", "+34 450 65 00 13", "+34 900 05 65 23", "+49 343 65 65 43", "+44 456 64 13 43", "+31 422 65 65 43"};

        public static String NombreApellidoAleatorio(String[] nombres, String[] apellidos){

            Random random = new Random();
            
            int indexNombre = random.nextInt(nombres.length);
            String nombreAleatorio = nombres[indexNombre];

            int indexApellido = random.nextInt(apellidos.length);
            String appellidoAleatorio = apellidos[indexApellido];

            String nombreCompleto = nombreAleatorio + " "+ appellidoAleatorio;

            return nombreCompleto;
        
    }

        public static String NombreAleatorio(String[] nombres){

            Random random = new Random();
            
            int indexNombre = random.nextInt(nombres.length);
            String nombreAleatorio = nombres[indexNombre];

            

            String nombreCompleto = nombreAleatorio;

            return nombreCompleto;
        
    }

    public static String ApellidoAleatorio(String[] apellidos){

        Random random = new Random();
        
        int indexApellido = random.nextInt(apellidos.length);
        String appellidoAleatorio = apellidos[indexApellido];

        

        String nombreCompleto = appellidoAleatorio;

        return nombreCompleto;

    }
    public static String TelefonoAleatorio(String[] telefono){

        Random random = new Random();
        
        int indexTelefono = random.nextInt(telefono.length);
        String telefonoAleatorio = telefono[indexTelefono];

        

        return telefonoAleatorio;

    }

    public static int IdOficinaAleatorio(){

        Random random = new Random();
        
        int enterAleatorio = random.nextInt(200, 400);        

        return enterAleatorio;
    
}

    public static int IdAleatorio(){

        Random random = new Random();
        
        int enterAleatorio = random.nextInt(100, 200);        

        return enterAleatorio;

    }


    public static String NombreAleatorio(){
        return NombreApellidoAleatorio(NOMBRES, APELLIDOS);
    }
    
}
