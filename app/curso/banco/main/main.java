package app.curso.banco.main;

import app.curso.banco.entidad.Cliente;
import app.curso.banco.entidad.Gestor;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("\n+++++++++++++++++++++Cliente+++++++++++++++++++++++++++");
        Cliente c1 = new Cliente(1, "Paco", "+34 456 66 66 44", 0);
        c1.mostrarInfo();

        c1.ingresarDinero(5.4f);
        System.out.println("======> Info: tu nuevo saldo: " + c1.mostrarSaldo() + "€");
        c1.mostrarInfo();
        c1.retirarDinero(6.4f);
        c1.mostrarInfo();
        System.out.println("+++++++++++++++++++++Gestor+++++++++++++++++++++++++++");
        Gestor g1 = new Gestor(10, "Juan", "+34 456 12 34 32", 44);
        g1.mostrarInfo();














    }      
}
