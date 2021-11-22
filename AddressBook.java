/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad12;

/**
 *
 * @author abii_
 */
public class AddressBook {
    
    private Contactos[] contactos;
    
    public AddressBook(){
        this.contactos = new Contactos[10];
    }
    
    public AddressBook(int tamanio){
        this.contactos = new Contactos[tamanio];
    }
    
    public void agregarContacto(Contactos cs){
        
        if(existeContacto(cs)){
            System.out.println("El contacto ya existe :|");
        }else if(capacidadContacto()){
            System.out.println("Address Book ya no tiene espacio :c");
        }else{
            boolean encontrado = false;
        for(int i=0;i<contactos.length && !encontrado;i++){
        if(contactos[i]==null){
            contactos[i]=cs;
            encontrado=true;
        }
    }
        if(encontrado){
            System.out.println("Se agregó el contacto.");
        }else {
            System.out.println("No se agregó el contacto :c");
        }
        }
        
        
    }
    
    public boolean existeContacto(Contactos cs){
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]!=null && cs.equals(contactos[i])){
                return true;
            }
        }
        return false;
    }
    
    public void verContacto(){
        if(espacioVacio()==contactos.length){
            System.out.println("No hay contactos que mostrar");
        }else {
            for(int i=0;i<contactos.length;i++){
            if(contactos[i]!=null){
                System.out.println(contactos[i]);
            }
        }
        }
        
    }
    
    public void buscarContactoN (String nombre){
        boolean encontrado = false;
        for(int i=0;i<contactos.length && !encontrado;i++){
            if(contactos[i]!=null && contactos[i].getNombre().equalsIgnoreCase(nombre)){
                System.out.println("El numero es: " + contactos[i].getNumero());
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No se encontró el contacto que busca :c");
        }
    }
    public boolean capacidadContacto(){
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]==null){
                return false;
            }
        }
        return true;
    }
    
    public void eliminarContacto(Contactos cs){
        boolean encontrado = false;
        for(int i=0;i<contactos.length && !encontrado;i++){
            if(contactos[i]!=null && contactos[i].equals(cs)){
                contactos[i]= null;
                encontrado=true;
            }
        }
        if(encontrado){
            System.out.println("Se eliminó exitosamente!");
        }else {
            System.out.println("No se eliminó el contacto :c");
        }
    }
    
    public int espacioVacio(){
        int contadorVacio=0;
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]==null){
                contadorVacio++;
            }
        }
        return contadorVacio;
    }
}
