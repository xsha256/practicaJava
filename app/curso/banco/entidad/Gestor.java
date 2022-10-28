package app.curso.banco.entidad;

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


        //! Modificador
	public void setIdOficina(int idOficina) {
		this.idOficina = idOficina;
	}

        //! Mostar info 
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Id de oficina: " + idOficina + "\n");
    }

    






    
}
