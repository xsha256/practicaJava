package app.curso.banco.main;
import app.curso.banco.entidad.*;
import app.curso.banco.util.*;

import java.util.HashMap;
import java.util.Scanner;

public class ConsolaBanco {
    public static void main(String[] args) {

        
        
        HashMap <Integer, Gestor> gestores = new HashMap<>();
        HashMap<Integer, Cliente> cliente = new HashMap<>();

        Scanner keyboard  = new Scanner(System.in);
        
        
    

       int menuSeleciona = -1;
       do{
        
                System.out.println("1. Inserción de un gestor.");
                System.out.println("2. Inserción masiva de gestores con datos aleatorios.");
                System.out.println("3. Obtención de un gestor.");
                System.out.println("4. Obtención de todos los gestores.");
                System.out.println("5. Actualización de un gestor.");
                System.out.println("6. Eliminación de un gestor.");
                System.out.println("7. Inserción de un cliente.");
                System.out.println("8. Obtención de un cliente.");
                System.out.println("9. Obtención de todos los clientes.");
                System.out.println("10. Actualización de uncliente.");
                System.out.println("11. Eliminación de un cliente.");
                System.out.println("12. Obtención de un mensaje.");
                System.out.println("13. Obtención de todos los mensajes.");
                System.out.println("14. Envío de un mensaje.");
                System.out.println("15. Obtención de una transferencia.");
                System.out.println("16. Obtención de todas las trasferencias");
                System.out.println("17. Envío de una transferencia.");
                System.out.println("18. Login y registro.");
                System.out.println("0. Salir");

                System.out.print("Opcion: ");
                menuSeleciona = keyboard.nextInt();
                    switch (menuSeleciona){
                        case 0:
                            System.out.println("Saliendo...");
                            break;
                        case 1:
                            System.out.println("1. Inserción de un gestor.");
                                                                          //! insertar los datos del gestor
                            System.out.print("Id: ");
                            int id = keyboard.nextInt();
                            System.out.print("Nombre y Apellido: ");
                            String nombre = keyboard.next();
                            System.out.print("Telefono: ");
                            String tel = keyboard.next();
                            System.out.print("Id de oficina: ");
                            int idOficina = keyboard.nextInt();
                                                                           //! Crear el gestor
                            if (gestores.get(id) == null){
                                Gestor gestor1 = new Gestor(id, nombre,  tel, idOficina);
                                                                            //! Crear el HashMap
                                gestores.put(id, gestor1);
                                System.out.println("Gestor creado con Id: " + gestores.get(id).getId() );
                            } else{
                                System.out.println("Existe un gestor con este id" + gestores.get(id).getId() );
                            }
                            break;
                        case 2:
                            System.out.println("2. Inserción masiva de gestores con datos aleatorios.");

                            for (int i = 0; i < 10; i ++) {
                                String NombreCompleto= Utiles.NombreApellidoAleatorio(Utiles.NOMBRES, Utiles.APELLIDOS);
                                System.out.println(NombreCompleto);                
                            }
                            break;
                        case 3:
                            System.out.println("3. Obtención de un gestor.");
                            System.out.print("Id: ");
                             id = keyboard.nextInt();
                            if (gestores.get(id) != null) {
                                gestores.get(id).mostrarInfo();
                            } else {
                                System.out.println("Gestor no creado");
                            } 
                            break;

                        case 4:
                            System.out.println("4. Obtención de todos los gestores.");
                            break;
                        case 5:
                            System.out.println("5. Actualización de un gestor.");
                            break;
                        case 6:
                            System.out.println("6. Eliminación de un gestor.");
                            System.out.print("Id: ");
                             id = keyboard.nextInt();
                             if (gestores.get(id) != null) {
                                gestores.remove(id);
                                System.out.println("Se ha eliminar el gestor con este id:  " + id);
                            } else {
                                System.out.println("Gestor no creado");
                            } 
                            break;
                        case 7:
                            System.out.println("7. Inserción de un cliente.");
                            System.out.print("Id: ");
                            int idCliente = keyboard.nextInt();
                            System.out.print("Nombre y Apellido: ");
                            String nombreClietne = keyboard.next();
                            System.out.print("Telefono: ");
                            String telCliente = keyboard.next();
                            System.out.print("Cantidad de dinero: ");
                            float dinero = keyboard.nextFloat();
                            if (cliente.get(idCliente) == null){
                                Cliente cliente1 = new Cliente(idCliente, nombreClietne,  telCliente, dinero);
                                 //! Crear el HashMap
                                cliente.put(idCliente, cliente1);
                                System.out.println("Cliente creado con Id: " + cliente.get(idCliente).getId() );
                            } else{
                                System.out.println("Existe un cliente con este id" + cliente.get(idCliente).getId() );
                            }
                            break;

                            




                        default: 
                        System.out.print("Opcion incorrecta...");
                        break;
            } 
        }while (menuSeleciona != 0);
        keyboard.close();


        

























    }
}
