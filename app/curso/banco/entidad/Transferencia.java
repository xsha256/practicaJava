package app.curso.banco.entidad;

public class Transferencia {
    private float cantidad;
    private int numTransferencia;

  //! constructor por defecto
    public Transferencia(){
  }

    //! constructor parametrizado 1
    public Transferencia (int numTransferencia, float cantidad){
      //* atributo no heredado creado en Cliente.
      this.numTransferencia = numTransferencia;
      this.cantidad = cantidad;
      
  }


   //! Mostar info 1
   public void mostrarInfo1() {
    System.out.println("Cantidad de transferencia: " + cantidad +"€" +"\n");
}
   //! Mostar info 2
   public void mostrarInfo() {
      System.out.println("Numero de transferencia: " + numTransferencia);
      System.out.println("Cantidad de transferencia: " + cantidad +"€" +"\n");
  }

  public int getNumeroTrans() {
      return numTransferencia;
  }


}
