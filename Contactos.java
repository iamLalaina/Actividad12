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
public class Contactos {
    
    private int numero;
    private String nombre;
    
    public Contactos(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }
    
    public Contactos(String nombre) {
        this.numero = 0;
        this.nombre = nombre;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public boolean equals(Contactos cs){
        if(this.nombre.equalsIgnoreCase(cs.getNombre())){
            return true;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return numero + "," + nombre;
    }
    
   // @Override
    //public String toString(){
      //  return "Número: " + numero + ":" + "Nombre: " + nombre;
    //}
}
