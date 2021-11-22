/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad12;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author abii_
 */
public class Actividad12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        boolean salir = false;
        int opcion;
        Contactos cs;
        
        AddressBook agendaTelefonica = new AddressBook(5);
        int numero;
        String nombre;
        
        while (!salir){
            System.out.println("1. Agregar contacto");
            System.out.println("2. Ver contactos");
            System.out.println("3. Buscar contacto contacto");
            System.out.println("4. Encontrado contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Capacidad de contactos");
            System.out.println("7. Agenda llena");
            System.out.println("8. Salir");
            try {
                System.out.println("Elige una opción");
                opcion = sn.nextInt();
                
                switch (opcion) {
                    case 1:
                        System.out.println("Escribe el nombre: ");
                        nombre = sn.next();
                        System.out.println("Escribe el numero: ");
                        numero = sn.nextInt();
                        cs = new Contactos(numero, nombre);
                        agendaTelefonica.agregarContacto(cs);
                        break;
                    case 2:
                        agendaTelefonica.verContacto();
                        break;
                    case 3:
                        System.out.println("Escribe el nombre: ");
                        nombre = sn.next();
                        agendaTelefonica.buscarContactoN(nombre);
                        break;
                    case 4:
                        System.out.println("Escribe el nombre: ");
                        nombre = sn.next();
                        cs = new Contactos(0, nombre);
                        if(agendaTelefonica.existeContacto(cs)){
                            System.out.println("Existe el contacto!");
                        }else {
                            System.out.println("No existe el contacto!");
                        }
                        break;
                    case 5:
                        System.out.println("Escribe el nombre: ");
                        nombre = sn.next();
                        cs = new Contactos(0, nombre);
                        agendaTelefonica.eliminarContacto(cs);
                        break;
                    case 6:
                        System.out.println("Hay "+agendaTelefonica.espacioVacio()+" contactos vacios");
                        break;
                    case 7:
                        if(agendaTelefonica.capacidadContacto()){
                            System.out.println("La AddressBook esta completa");
                        }else {
                            System.out.println("Aún puedes agregar :D");
                        }
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opciones permitidas entre 1 y 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingresa un número");
                sn.next();
            }
        }
    }
    
}
