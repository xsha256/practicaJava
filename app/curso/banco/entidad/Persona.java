package app.curso.banco.entidad;

public class Persona {

    protected int id;
    protected String nombre;
    protected String telefono;

    //! constructor por defecto
     public Persona(){
        
    }

    //! constructor parametrizado 
     public Persona(int id, String nombre, String telefono) {

        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;

     }

        public int getId() {
        return id;
    }

    public void setId(int id) {
         this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono; 
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //! Mostrar info de persona 1
    public void mostrarInfo1() {
        System.out.println("Nombre y apellido: " + this.nombre);
        System.out.println("Telefono: " + this.telefono);
    }
    //! Mostrar info de persona 2
    public void mostrarInfo() {
        System.out.println("Id: " + this.id);
        System.out.println("Nombre y apellido: " + this.nombre);
        System.out.println("Telefono: " + this.telefono);
    }






    
}
