package app.curso.banco.entidad;
// import app.curso.banco.util.*;


public class Gestor extends Persona {

            private int idOficina;

                //! constructor por defecto
                public Gestor(){
                }

                //! constructor parametrizado 
            public Gestor (int id, String nombre, String telefono, int idOficina){
                //*  atributos heredados de Persona
                super(id, nombre, telefono);

                //* atributo no heredado creado en Cliente.
                this.idOficina = idOficina;
                
            }

                //! consultor
            public int getIdOficina() {
                return idOficina;
            }

            public String getNombre() {
                return nombre;
            }

            public String toString(){
                return "id: " + this.id;
            
            }


                //! Modificador
            public void setIdOficina(int idOficina) {
                this.idOficina = idOficina;
            }

            

                //! Mostar info 
            public void mostrarInfo() {
                super.mostrarInfo();
                System.out.println("Id de oficina: " + idOficina + "\n");
            }
          
            // public void eliminarGestor(){
            //     this.gestores.remove(idCuenta);
            //     System.out.println("Se ha cerrado la cuenta " + idCuenta);
            // }
            

           

            

 
} 

