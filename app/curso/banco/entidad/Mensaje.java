package app.curso.banco.entidad;

public class Mensaje {

     
      protected int nuMensaje;
      protected char tipoEmesor;
      protected int idEmisor;

      protected char tipoReceptor;
      protected int idReceptor;

      protected String mensaje;

      public static final char TIPO_CLIENTE = 'c';
      public static final char TIPO_GESTOR = 'g';

    //! constructor por defecto
      public Mensaje(){
    }

      //! constructor parametrizado 1
      public Mensaje (int nuMensaje, char tipoEmesor , int idEmisor, char tipoReceptor , int idReceptor ,String mensaje){
        //* atributo no heredado creado en Cliente.
        this.nuMensaje = nuMensaje;
        this.tipoEmesor = tipoEmesor;
        this.idEmisor = idEmisor;
        this.tipoReceptor = tipoReceptor;
        this.idReceptor = idReceptor;
        this.mensaje = mensaje;
    }

    public int getNuMensaje() {
        return nuMensaje;
    }

     public void setNuMensaje(int nuMensaje) {
        this.nuMensaje = nuMensaje;
    }

    public char getTipoEmesor() {
        return tipoEmesor;
    }

    public void setTipoEmesor(char tipoEmesor) {
        this.tipoEmesor = tipoEmesor;
    }

    public int getIdEmisor() {
        return idEmisor;
    }

    public void setIdEmisor(int idEmisor) {
        this.idEmisor = idEmisor;
    }

    public char getTipoReceptor() {
        return tipoReceptor;
    }

    public void setTipoReceptor(char tipoReceptor) {
        this.tipoReceptor = tipoReceptor;
    }

    public int getIdReceptor() {
        return idReceptor;
    }

    public void setIdReceptor(int idReceptor) {
        this.idReceptor = idReceptor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String toString(){
       
        return "De: " + this.idEmisor +", para: "+ idReceptor +  " Mensaje: " + this.mensaje;
    
    }

    //! Mostar info 0
     public void mostrarInfo() {
        System.out.println("Numero de mensaje: " + nuMensaje);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Del cliente con id: " + this.idEmisor +", para el gestor con id: "+ idReceptor +  ". \n");

    }
    //! Mostar info 1
    public void mostrarInfo1() {
        // System.out.println("Numero de mensaje: " + nuMensaje);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Del cliente con id: " + this.idEmisor +", para el gestor con id: "+ idReceptor +  ". Mensaje: " + this.mensaje + "\n");
    }

     //! Mostar info 2
     public void mostrarInfo2() {
        System.out.println("Numero de mensaje: " + nuMensaje);
        System.out.println("Mensaje: " + mensaje);

    }


    


















}
