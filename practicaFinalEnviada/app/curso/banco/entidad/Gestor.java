package app.curso.banco.entidad;


public class Gestor extends Persona {

            private int idOficina;

                //! constructor por defecto
                public Gestor(){
                }

                //! constructor parametrizado 1
            public Gestor (int id, String nombre, String telefono, int idOficina){
                //*  atributos heredados de Persona
                super(id, nombre, telefono);

                this.idOficina = idOficina;
                
            }

            public int getIdOficina() {
                return idOficina;
            }

            public String getNombre() {
                return nombre;
            }
            public String getApellido() {
                
                return nombre;
            }
            public String getTelefono() {
                return telefono;
            }

            public String toString(){
                return "id: " + this.id;
            
            }


            public void setIdOficina(int idOficina) {
               
                this.idOficina = idOficina;

            }

            public void setGestor(int id, String nombre, String telefono, int idOficina) {
                super.id = id;
                super.nombre = nombre;
                super.telefono = telefono;
                this.idOficina = idOficina;
            }

            
            //! Mostar info 0
            public void mostrarInfo() {
                super.mostrarInfo();
                System.out.println("Id de oficina: " + idOficina + "\n");
            }

               //! Mostar info  1
               public void mostrarInfo1() {
                super.mostrarInfo1();
                System.out.println("Id de oficina: " + idOficina + "\n");
            }
    
          
       
            

           

            

 
} 

