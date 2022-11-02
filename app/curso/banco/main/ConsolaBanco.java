package app.curso.banco.main;
import app.curso.banco.entidad.*;
import app.curso.banco.util.*;

import java.util.HashMap;
import java.util.Scanner;

public class ConsolaBanco {
    public static void main(String[] args) {

        
        
        HashMap <Integer, Gestor> gestores = new HashMap<>();
        HashMap<Integer, Cliente> cliente = new HashMap<>();
        HashMap<Integer, Mensaje> mensaje = new HashMap<>();
        HashMap<Integer, Transferencia> transferencia = new HashMap<>();

        Scanner keyboard  = new Scanner(System.in);
        Cliente cliente1 = null;
        Gestor gestor1 = null;
        String men = null;
        Transferencia transferencia1 = null;
        Mensaje mensaje1 = null;
        int nuMensaje = 0; 
        
        //! colores para JAVA:
        // Negro:\033[30m
        //  Rojo: \033[31m
        //  Verde:\033[32m
        //  Amarillo:\033[33m
        //  Azul:\033[34m
        //  Magenta:\033[35m
        //  Blanco:\033[37m 
        //  Cyan:\033[36m
        //  Reset:\u001B[0m
    
        System.out.println("\n\033[32m                                     #     # ####### #     # #     #    ######     #    #     #  #####  #######");
        System.out.println("                                     ##   ## #       ##    # #     #    #     #   # #   ##    # #     # #     #");
        System.out.println("                                     # # # # #       # #   # #     #    #     #  #   #  # #   # #       #     #");
        System.out.println("                                     #  #  # #####   #  #  # #     #    ######  #     # #  #  # #       #     #");
        System.out.println("                                     #     # #       #   # # #     #    #     # ####### #   # # #       #     #");
        System.out.println("                                     #     # #       #    ## #     #    #     # #     # #    ## #     # #     #");
        System.out.println("                                     #     # ####### #     #  #####     ######  #     # #     #  #####  #######");

       int menuSeleciona = -1;
       do{
        
                System.out.println("\033[33m1. Inserción de un gestor.");                                                  //todo:  done
                System.out.println("2. Inserción masiva de gestores con datos aleatorios.");                  //todo:  done
                System.out.println("3. Obtención de un gestor.");                                                             //todo:  done
                System.out.println("4. Obtención de todos los gestores.");                                             //todo:  done
                System.out.println("5. Actualización de un gestor.");                                                      //todo:  done
                System.out.println("6. Eliminación de un gestor.");                                                        //todo:  done
                System.out.println("7. Inserción de un cliente.");                                                          //todo:  done
                System.out.println("8. Obtención de un cliente.");                                                      //todo:  done
                System.out.println("9. Obtención de todos los clientes.");                                       //todo:  done
                System.out.println("10. Actualización de un cliente.");                                            //todo:  done
                System.out.println("11. Eliminación de un cliente.");                                              //todo:  done
                System.out.println("12. Obtención de un mensaje.");                                           //todo:  done
                System.out.println("13. Obtención de todos los mensajes.");                             //todo:  done
                System.out.println("14. Envío de un mensaje.");                                                 //todo: done
                System.out.println("15. Obtención de una transferencia.");                              //todo:  done
                System.out.println("16. Obtención de todas las trasferencias");                     //todo:  done
                System.out.println("17. Envío de una transferencia.");                                     //todo: done
                System.out.println("18. Login y registro.");                                                      //todo: done
                System.out.println("0. Salir");

                System.out.print("Opcion: ");
                menuSeleciona = keyboard.nextInt();
                    switch (menuSeleciona){

                        case 0:
                            System.out.println("\033[35m Saliendo...");
                            System.out.println("\033[35m ¡Hasta luego, Lucas!...");
                            break;
                        case 1:
                            System.out.println("\033[32m1. Inserción de un gestor.");
                                                                          //! insertar los datos del gestor
                            System.out.print("Id: ");
                            int id = keyboard.nextInt();
                            System.out.print("Nombre: ");
                            String nombre = keyboard.next();
                            System.out.print("Apellido: ");
                            String apellido = keyboard.next();
                            System.out.print("Tu telefono(en este formato: +34-567-65-54-43): ");
                            String tel = keyboard.next();
                            System.out.print("Id de oficina: ");
                            int idOficina = keyboard.nextInt();
                            

                            String nombreApellido = nombre + " " + apellido;
                                                                           //! Crear el gestor
                            if (gestores.get(id) == null){
                                 gestor1 = new Gestor(id, nombreApellido,  tel, idOficina);
                                                                            //! Crear el HashMap
                                gestores.put(id, gestor1);
                                System.out.println("Gestor creado con Id: " + gestores.get(id).getId() );
                            } else{
                                System.out.println("Existe un gestor con este id" + gestores.get(id).getId() );
                            }
                            break;
                        case 2:
                            System.out.println("\033[32m2. Inserción masiva de gestores con datos aleatorios.");
                            System.out.print("¿Cuantos gestores quieres crear? ");
                            int gestoresACrear = keyboard.nextInt();

                            for (int i = 0; i < gestoresACrear; i ++) {
                               
                                String Nombre = Utiles.NombreApellidoAleatorio(Utiles.NOMBRES, Utiles.APELLIDOS);
                                String Telefono = Utiles.TelefonoAleatorio(Utiles.TELEFONO);
                                int IdOficina = Utiles.IdOficinaAleatorio();
                                int Id = Utiles.IdAleatorio();

                                Gestor gestor2 = new Gestor(Id, Nombre, Telefono, IdOficina);
                                gestores.put(Id, gestor2);
                                           
                            }
                            break;
                        case 3:
                            System.out.println("\033[34m3. Obtención de un gestor.");
                            System.out.print("Id: ");
                             id = keyboard.nextInt();
                            if (gestores.get(id) != null) {
                                gestores.get(id).mostrarInfo1();
                            } else {
                                System.out.println("Gestor no creado");
                            } 
                            break;

                        case 4:
                            System.out.println("\033[34m4. Obtención de todos los gestores.");
                            if (gestores != null) {
                                gestores.forEach((clave, valor) -> { 
                                valor.mostrarInfo();
                                 });
                            } else {
                                System.out.println("Gestores no creados");
                            } 
                            break;
                        case 5:
                            System.out.println("\033[36m5. Actualización de un gestor.");
                            System.out.print("Id: ");
                             id = keyboard.nextInt();
                             System.out.println("El nombre actual: " + gestores.get(id).getNombre() + " si  quieres mantener el nombre reescribelo");
                            System.out.print("Nombre: ");
                            nombre = keyboard.next();
                            System.out.println("El apellido actual: " + gestores.get(id).getApellido() + " si  quieres mantener el apellido reescribelo");
                            System.out.print("Apellido: ");
                             apellido = keyboard.next();
                            System.out.println("El telefono actual: " + gestores.get(id).getTelefono() + " si  quieres mantenerlo reescribelo");
                            System.out.print("Telefono: ");
                            tel = keyboard.next();
                            System.out.println("El id de oficina actual: " + gestores.get(id).getIdOficina() + " si  quieres mantenerlo reescribelo");
                            System.out.print("Id de oficina: ");
                            idOficina = keyboard.nextInt();

                            

                             nombreApellido = nombre + " " + apellido;

                             gestor1 = new Gestor(id, nombreApellido,  tel, idOficina);
                            gestores.put(id, gestor1);
                            // gestor1.setGestor(id, nombre, tel, idOficina);

                            break;
                        case 6:
                            System.out.println("\033[31m6. Eliminación de un gestor.");
                            System.out.print("Id: ");
                             id = keyboard.nextInt();
                             
                             if (gestores.get(id) != null) {
                                gestores.remove(id);
                                System.out.println("Se ha eliminado el gestor con este id:  " + id);
                            } else {
                                System.out.println("Gestor no creado");
                            } 
                            break;
                        case 7:
                            System.out.println("\033[32m7. Inserción de un cliente.");
                            System.out.print("Id: ");
                            int idCliente = keyboard.nextInt();
                            System.out.print("Nombre: ");
                            String nombreCliente = keyboard.next();
                            System.out.print("Apellido: ");
                            String apellidoCliente = keyboard.next();
                            System.out.print("Tu telefono(en este formato: +34-567-65-54-43): ");
                            String telCliente = keyboard.next();
                            System.out.print("Id de tu cuenta empieza por ES: ");
                            String idEs = keyboard.next();
                            System.out.print("Cantidad de dinero: ");
                            float dinero = keyboard.nextFloat();

                            String nombreApellidoCliente = nombreCliente + " " + apellidoCliente;
                           
                            if (cliente.get(idCliente) == null){
                                 cliente1 = new Cliente(idCliente, nombreApellidoCliente,  telCliente);
                                 //! Crear el HashMap
                                cliente.put(idCliente, cliente1);
                                System.out.println("Cliente creado con Id: " + cliente.get(idCliente).getId() );
                                cliente1.abrirCuenta(idEs, dinero );
                                cliente1.mostrarCuentas();
                            } else{
                                System.out.println("Existe un cliente con este id" + cliente.get(idCliente).getId() );
                            }
                            break;
                        case 8:
                            System.out.println("\033[34m8. Obtención de un cliente.");
                            System.out.print("Id: ");
                             idCliente = keyboard.nextInt();
                            if (cliente.get(idCliente) != null) {
                                cliente.get(idCliente).mostrarInfo1();
                            } else {
                                System.out.println("Cliente no creado");
                            } 
                            break;

                        case 9:
                            System.out.println("\033[34m9. Obtención de todos los clientes.");
                            if (cliente != null) {
                                cliente.forEach((clave, valor) -> { 
                                valor.mostrarInfo();
                                 });
                            } else {
                                System.out.println("Cliente no creados");
                            } 
                            break;
                        case 10:
                                System.out.println("\033[36m10. Actualización de un cliente.");
                                System.out.print("Id: ");
                                idCliente = keyboard.nextInt();
                                Cliente actualizarClt = cliente.get(idCliente);
                                System.out.println("El nombre actual: " + cliente.get(idCliente).getNombre() + " si  quieres mantener el nombre reescribelo");
                                System.out.print("Nombre: ");
                                nombre = keyboard.next();
                                System.out.println("El apellido actual: " + cliente.get(idCliente).getApellido() + " si  quieres mantener el apellido reescribelo");
                                System.out.print("Apellido: ");
                                apellido = keyboard.next();
                                System.out.println("El telefono actual: " + cliente.get(idCliente).getTelefono() + " si  quieres mantenerlo reescribelo");
                                System.out.print("Telefono: ");
                                tel = keyboard.next();

                                nombreApellido = nombre + " " + apellido;
                                
                                // Cliente cliente1 = new Cliente(id, nombreApellido,  tel);
                                // cliente.put(id, cliente1);
                                actualizarClt.setCliente(idCliente, nombreApellido, tel);
                                break;
                            case 11:
                                System.out.println("\033[31m11. Eliminación de un cliente.");
                                System.out.print("Id: ");
                                id = keyboard.nextInt();
                                if (cliente.get(id) != null) {
                                   cliente.remove(id);
                                   System.out.println("Se ha eliminado el gestor con este id:  " + id);
                               } else {
                                   System.out.println("Gestor no creado");
                               } 
                               break;
                            case 12:
                                System.out.println("\033[34m12. Obtención de un mensaje.");
                                System.out.print("Mensaje numero: ");
                                nuMensaje = keyboard.nextInt();
                                if (mensaje.get(nuMensaje) != null) {
                                    mensaje.get(nuMensaje).mostrarInfo1();
                                } else {
                                    System.out.println("Gestor no creado");
                                } 

                                break;
                                
                            case 13: 
                                System.out.println("\033[34m13. Obtención de todos los mensajes.");
                                if (mensaje != null) {
                                    mensaje.forEach((clave, valor) -> { 
                                    valor.mostrarInfo();
                                     });
                                } else {
                                    System.out.println("No existe este mensaje");
                                } 
                                break;
                            case 14:
                                System.out.println("\033[31m14. Envío de un mensaje.");
                                System.out.print("Mensaje numero: ");
                                 nuMensaje = keyboard.nextInt();
                                
                                System.out.print("Mensaje: ");
                                  men = keyboard.next();
                                        
                                 mensaje1 = new Mensaje(nuMensaje, Mensaje.TIPO_CLIENTE, cliente1.getId(), Mensaje.TIPO_GESTOR, gestor1.getId(), men);
                                // System.out.println(mensaje1);

                                                                                    //! Crear el HashMap
                                mensaje.put(nuMensaje, mensaje1);
                                System.out.println(mensaje1);
                                
                                break;
                            case 15:
                                System.out.println("\033[34m15. Obtención de una transferencia.");
                                System.out.print("Mensaje numero: ");
                                nuMensaje = keyboard.nextInt();
                                if (mensaje.get(nuMensaje) != null) {
                                    mensaje.get(nuMensaje).mostrarInfo1();
                                } else {
                                    System.out.println("Gestor no creado");
                                } 
                                
                                break;
                            case 16: 

                                System.out.println("\033[34m16. Obtención de todas las trasferencias");
                                if (transferencia != null) {
                                    transferencia.forEach((clave, valor) -> { 
                                    valor.mostrarInfo();
                                     });
                                } else {
                                    System.out.println("No existe este mensaje");
                                } 
                                break;
                            case 17: 
                                System.out.println("\033[31m17. Envío de una transferencia.");
                                System.out.print("Mensaje numero: ");
                                 nuMensaje = keyboard.nextInt();

                                 System.out.print("Mensaje: ");
                                  men = keyboard.next();

                                  System.out.print("Cantidad de dinero: ");
                                  float cantidad = keyboard.nextFloat();

                                 transferencia1 = new Transferencia(nuMensaje, Transferencia.TIPO_CLIENTE, cliente1.getId(), Transferencia.TIPO_GESTOR, gestor1.getId(), men, cantidad);
                                // System.out.println(transferencia1);
                                                //! Crear el HashMap
                                transferencia.put(nuMensaje, transferencia1);
                                System.out.println(transferencia1);
                                break;
                            case 18:
                                System.out.println("18. Login y registro.");

                                System.out.print("Si quieres acceder pulsa 1, si quieres registrar pulsa 2: ");
                               int  op = keyboard.nextInt();

                                if (op == 1) {
                                System.out.print("Id de cliente: ");
                                 idCliente = keyboard.nextInt();
                                 Cliente clienteParaLogin = cliente.get(idCliente);

                                 System.out.print(" Password: ");
                                 String pass = keyboard.next(); 

                                 String passCliente = clienteParaLogin.getPassword();

                                 boolean tienePass = passCliente != null;

                                 boolean loginCorrecto =  tienePass && passCliente.equals(pass);

                                 if (loginCorrecto) {
                                    System.out.println("Login correcto!.");
                                                                        
                                 } else {
                                    System.out.println("Incorrecto");
                                 }
                            } else if(op == 2) {

                                 System.out.println(" registrar.");
                                 System.out.print(" Id de cliente para registrar como usuario: ");
                                 int idClienteRegistrar = keyboard.nextInt();
                                 Cliente clienteParaRegistro = cliente.get(idClienteRegistrar);
                                 System.out.print("Nueva contraseña: ");
                                 String Nuevopass = keyboard.next();
                                 clienteParaRegistro.setPassword(Nuevopass);
                                 //actualizar cliente en la lista
                                 cliente.put(clienteParaRegistro.getId(), clienteParaRegistro);       
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
