package app.curso.banco.entidad;

public class Transferencia extends Mensaje {
    private float cantidad;

    //! constructor por defecto
      public Transferencia(){
    }

    //! constructor parametrizado 1
    public Transferencia (int nuMensaje, char tipoEmesor , int idEmisor, char tipoReceptor , int idReceptor ,String mensaje, float cantidad){
      super(nuMensaje, tipoEmesor, idEmisor, tipoReceptor, idReceptor, mensaje);
      this.cantidad = cantidad;
  }

    public float getCantidad() {
      return cantidad;
  }

  public void setCantidad(float cantidad) {
      this.cantidad = cantidad;
  }


  public String toString(){
    String texto = super.toString();
    texto += ". Cantidad de dinero: " + this.cantidad + "€";
        
    return texto;

  }
    //! Mostar info 1
    public void mostrarInfo1() {
      System.out.println("Cantidad de transferencia: " + cantidad +"€" +"\n");
  }

  //! Mostar info 2
    public void mostrarInfo() {
        super.mostrarInfo1();
        System.out.println("Cantidad de transferencia: " + cantidad +"€" +"\n");
    }

      //! Mostar info 3
      public void mostrarInfo3() {
        super.mostrarInfo2();
        System.out.println("Del cliente con id: " + this.idEmisor +", para el gestor con id: "+ idReceptor +  ". Cantidad de: " + this.cantidad + "€" + "\n");
    }



}
