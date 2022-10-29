package app.curso.banco.entidad;
// import app.curso.banco.util.*;


public class Gestor extends Persona {

            private int idOficina;

                //! constructor por defecto
                public Gestor(){
                }

                //! constructor parametrizado 1
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
            public String getTelefono() {
                return telefono;
            }

            public String toString(){
                return "id: " + this.id;
            
            }

            // public String getGestor(){
            //     return "id: " + this.id;
            //     return "nombre: " + this.nombre;
            //     return "telefono: " + this.telefono;
            //     return "Id de oficina: " +  this.idOficina;
            
            // }


                //! Modificador
            public void setIdOficina(int idOficina) {
               
                this.idOficina = idOficina;

            }

            public void setGestor(int id, String nombre, String telefono, int idOficina) {
                super.id = id;
                super.nombre = nombre;
                super.telefono = telefono;
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

