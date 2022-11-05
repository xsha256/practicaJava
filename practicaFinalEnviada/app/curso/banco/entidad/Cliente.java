package app.curso.banco.entidad;

import java.util.HashMap;

public class Cliente extends Persona{

    private float totalDinero; 

    private HashMap<String, Float> cuentas;

            //! constructor por defecto
        public Cliente(){
        }

        //! constructor parametrizado 1
        public Cliente (int id, String nombre, String telefono){
            //*  atributos heredados de Persona
                super(id, nombre, telefono);
    
            //* atributo no heredado creado en Cliente.
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


           //! Mostar info 0
           public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Cuentas:");
            mostrarCuentas();
            System.out.println("Total de dinero: " + totalDinero + "€\n");
           
        }

         //! Mostar info 1
         public void mostrarInfo1() {
            super.mostrarInfo1();
            System.out.println("Cuentas:");
            mostrarCuentas();
            System.out.println("Total de dinero: " + totalDinero + "€\n");
           
        }

 
        public float mostrarSaldo() {
        return  totalDinero;
            
        }

        public float getTotalDinero() {
            return this.totalDinero;
        }

        public HashMap <String, Float>  getCuentas()  {
            return this.cuentas;
        }
        public String getApellido() {
                    
            return nombre;
        }

        public void setTotalDinero(float totalDinero) {
            this.totalDinero = totalDinero;
        }

        public void setCuentas (HashMap <String, Float> cuentas) {
            this.cuentas = cuentas;
        }

        public void setCliente(int id, String nombre, String telefono) {
            super.id = id;
            super.nombre = nombre;
            super.telefono = telefono;
        
        }

        //* Metodo ingresarDinero
        public  float ingresarDinero(float dinero){
            return this.totalDinero += dinero; 
        
        }

        //*  Metodo retirarDinero
        public  float retirarDinero(float dinero){
            
            this.totalDinero -= dinero; 
            return this.totalDinero; 
        }


        public  float ingresarDinero(String idCuenta, Float dinero){
            Float dineroEnCuenta = this.cuentas.get(idCuenta);
            if (dineroEnCuenta !=  null){
                this.cuentas.put(idCuenta, dineroEnCuenta + dinero);
                retirarDinero(dinero);
                System.out.println("Se ha ingresado " + dinero + " € en " + idCuenta);
            }  else {
                System.out.println("La cuenta no existe");
            }
            return this.totalDinero; 

        }

        public void abrirCuenta(String idCuenta, Float dinero){
            this.cuentas.put(idCuenta, dinero);
            ingresarDinero(dinero);
            System.out.println("Se ha abierto la cuenta " + idCuenta);
        }

        public void cerrarCuenta(String idCuenta) {
            Float dineroEnCuenta = this.cuentas.get(idCuenta);
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
