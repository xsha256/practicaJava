package app.curso.banco.entidad;

import java.util.HashMap;

public class Cliente extends Persona{

    private float totalDinero; 

    //! Cada cuenta tiene una clave o ID de tipo String  y cantidad de dinero float
    private HashMap<String, Float> cuentas;

        //! constructor por defecto
    public Cliente(){
    }

        //! constructor parametrizado 1
        public Cliente (int id, String nombre, String telefono){
            //*  atributos heredados de Persona
                super(id, nombre, telefono);
    
                //* atributo no heredado creado en Cliente.
                this.totalDinero = 0;
                this.cuentas = new HashMap<>();
            
        }
        
        //! constructor parametrizado  2
    public Cliente (int id, String nombre, String telefono, float totalDinero){
        //*  atributos heredados de Persona
         super(id, nombre, telefono);

         //* atributo no heredado creado en Cliente.
         this.totalDinero = totalDinero;
         this.cuentas = new HashMap<>();
        
    }

        //! Mostar info 
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cuentas:");
		mostrarCuentas();
        System.out.println("Total de dinero: " + totalDinero + "€\n");
       
    }
    public float mostrarSaldo() {
       return  totalDinero;
        
    }

         //! consultor
    public float getTotalDinero() {
        return this.totalDinero;
    }

    public HashMap <String, Float>  getCuentas()  {
        return this.cuentas;
    }

          //! Modificador
    public void setTotalDinero(float totalDinero) {
        this.totalDinero = totalDinero;
    }

    public void setCuentas (HashMap <String, Float> cuentas) {
        this.cuentas = cuentas;
    }

     //* Metodo ingresarDinero
    public  float ingresarDinero(float dinero){
        return this.totalDinero += dinero; 
       
    }

    //*  Metodo retirarDinero
    public  float retirarDinero(float dinero){
        
        // this.totalDinero -= dinero; 
        this.totalDinero -= dinero; 
        // if (totalDinero - dinero > 0){
        //     this.totalDinero -= dinero; 
        // } else {
        //     System.out.println("****************************** ¡¡Alerta!! => Tu cuenta esta en discubierto: " + totalDinero + "€ " +"No se puede retirar ****************************** ");
        // }
        return this.totalDinero; 
    }


    //* Sobre carga de metodo  ingresarDinero
    public  float ingresarDinero(String idCuenta, Float dinero){
        Float dineroEnCuenta = this.cuentas.get(idCuenta);
        // comprobar si existe la cuenta
		// (si no existe, en vez de dinero tenemos null)
        if (dineroEnCuenta !=  null){
            this.cuentas.put(idCuenta, dineroEnCuenta + dinero);
            retirarDinero(dinero);
            System.out.println("Se ha ingresado " + dinero + " € en " + idCuenta);
        }  else {
            System.out.println("La cuenta no existe");
        }
        return this.totalDinero; 

    }
    
            //! retirarDinero con  restriccion de sacar dinero
      //* Sobre carga de metodo retirarDinero
      public  float retirarDinero(String idCuenta, Float dinero ){
        Float dineroEnCuenta = this.cuentas.get(idCuenta);
        //*  Comprobar si existe la cuenta
        if (dineroEnCuenta !=  null){
            if(dineroEnCuenta - dinero > 0){
                this.cuentas.put(idCuenta, dineroEnCuenta - dinero);
                retirarDinero(dinero);
                System.out.println("Se ha retirado " + dinero + " € de " + idCuenta);
            } else {
                float discubierto = totalDinero - dinero;
                System.out.println("****************************** ¡¡Alerta!! => Tu cuenta esta en discubierto: " + discubierto+ "€ " +"solo puedes retirar: "+  totalDinero +  "€ no "  + dinero+"€ Gracias ****************************** ");
            }
        }  else {
            System.out.println("La cuenta no existe");
        }
        return this.totalDinero; 
    }
    //! retirarDinero sin añadir la restriccion de sacar dinero
    //   //* Sobre carga de metodo retirarDinero
    //   public  float retirarDinero(String idCuenta, Float dinero ){
    //     Float dineroEnCuenta = this.cuentas.get(idCuenta);
    //     //*  Comprobar si existe la cuenta
    //     if (dineroEnCuenta !=  null){
    //         this.cuentas.put(idCuenta, dineroEnCuenta - dinero);
    //         retirarDinero(dinero);
    //         System.out.println("Se ha retirado " + dinero + " € de " + idCuenta);
    //     }  else {
    //         System.out.println("La cuenta no existe");
    //     }
    //     return this.totalDinero; 
    // }


    public void abrirCuenta(String idCuenta, Float dinero){
        this.cuentas.put(idCuenta, dinero);
        ingresarDinero(dinero);
        System.out.println("Se ha abierto la cuenta " + idCuenta);
    }

    public void cerrarCuenta(String idCuenta) {
        Float dineroEnCuenta = this.cuentas.get(idCuenta);
        // retirarDinero(idCuenta, dineroEnCuenta);
        if (dineroEnCuenta > 0){
            System.out.println("Por favor, retira tu dinero antes de cerrar la cuenta: " + dineroEnCuenta  );
        } else{
            this.cuentas.remove(idCuenta);
            System.out.println("Se ha cerrado la cuenta " + idCuenta);
        }
    }

    public void  mostrarCuentas(){
        this.cuentas.forEach((idCuenta, dinero) -> {
            System.out.println("> " + idCuenta + ": " + dinero + "€");
        });
    }



    

    

















}
