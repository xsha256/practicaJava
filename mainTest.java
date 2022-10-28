
import java.util.HashMap;
import app.curso.banco.entidad.*;

public class mainTest {
    public static void main(String[] args) { 
        

        Cliente client1 = new Cliente(1, "Carla Suarez", "+34 346 12 69 00");
        client1.mostrarInfo();
        client1.abrirCuenta("ES10", 500f);
        
        client1.abrirCuenta("ES20", 120f);
        
        client1.mostrarInfo();
        client1.mostrarCuentas();
        client1.retirarDinero("ES20", 20f);
        client1.retirarDinero("ES10", 200f);

        client1.mostrarInfo();
        client1.mostrarCuentas();
        client1.abrirCuenta("ES20", 120f);
        client1.mostrarCuentas();
        client1.mostrarInfo();
        client1.retirarDinero("ES20", 230f);
        client1.cerrarCuenta("ES20");
        client1.retirarDinero("ES20", 90f);
        client1.cerrarCuenta("ES20");
        client1.retirarDinero("ES20", 90f);
        client1.retirarDinero("ES10", 250f);
        client1.mostrarCuentas();
        client1.mostrarInfo();

    
        
     

        

        

    }

}
