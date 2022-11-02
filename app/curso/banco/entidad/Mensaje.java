package app.curso.banco.entidad;

public class Mensaje {

      private String mensaje;
      private int numero;

    //! constructor por defecto
      public Mensaje(){
    }

      //! constructor parametrizado 1
      public Mensaje (int numero, String mensaje){
        //* atributo no heredado creado en Cliente.
        this.numero = numero;
        this.mensaje = mensaje;
        
    }

     //! Mostar info 
     public void mostrarInfo() {
        System.out.println("Numero de mensaje: " + numero + "\n");
        System.out.println("Mensaje: " + mensaje + "\n");
    }

    public int getNumero() {
        return numero;
    }



















}
