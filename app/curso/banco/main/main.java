package app.curso.banco.main;

//! app.curso.banco.entidad.* significa todo lo que tenemos en la carpeta entidad lo utilizamos para no importar por separado todo lo que tenmos en la carpeta entidad
import app.curso.banco.entidad.*;
//! no hace falta importar import app.curso.banco.entidad.Gestor porq utilizamos la forma * para importar todo de la carpeta
// import app.curso.banco.entidad.Gestor;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("\n+++++++++++++++++++++Cliente+++++++++++++++++++++++++++");
        Cliente c1 = new Cliente(1, "Paco", "+34 456 66 66 44", 0);
        c1.mostrarInfo();

        c1.ingresarDinero(5.4f);
        System.out.println("********************************** Info: tu nuevo saldo: " + c1.mostrarSaldo() + "€ " + "************************************************** ");
        c1.mostrarInfo();
        c1.retirarDinero(6.4f);
        c1.mostrarInfo();
        System.out.println("+++++++++++++++++++++Gestor+++++++++++++++++++++++++++");
        Gestor g1 = new Gestor(10, "Juan", "+34 456 12 34 32", 44);
        g1.mostrarInfo();

        
        System.out.println("\n+++++++++++++++++++++ Cliente con Id +++++++++++++++++++++++++++");
        Cliente c3 = new Cliente(1, "Rafa", "+34 456 66 66 44", 0);
        c3.abrirCuenta("10", 40f);
        c3.mostrarInfo();
        c3.retirarDinero("10", 30f);
        
        c3.cerrarCuenta("10");
        // c3.retirarDinero("10", 10f);
        
       
       
         



         












    }      
}
