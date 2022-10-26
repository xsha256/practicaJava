package app.curso.banco.entidad;

public class Cliente extends Persona{

    private float totalDinero; 

        //! constructor por defecto
    public Cliente(){
    }

        //! constructor parametrizado 
    public Cliente (int id, String nombre, String telefono, float totalDinero){
        //*  atributos heredados de Persona
         super(id, nombre, telefono);

         //* atributo no heredado creado en Cliente.
         this.totalDinero = totalDinero;
        
    }

        //! Mostar info 
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Total de dinero: " + totalDinero + "€");
       
    }
    public float mostrarSaldo() {
       return  totalDinero;
        
    }

         //! consultor
    public float getTotalDinero() {
        return this.totalDinero;
    }

          //! Modificador
    public void setTotalDinero(float totalDinero) {
        this.totalDinero = totalDinero;
    }

    public  float ingresarDinero(float dinero){
        return this.totalDinero += dinero; 
    }

    public  float retirarDinero(float dinero){
        this.totalDinero -= dinero; 
        if (totalDinero < 0){
            System.out.println("¡¡Alerta!! => Tu cuenta esta en discubierto: " + totalDinero + "€");
        } 
        return this.totalDinero;
        
    }


















}
