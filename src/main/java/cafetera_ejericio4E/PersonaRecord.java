/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package cafetera_ejericio4E;

/**
 *
 * @author nacho
 */
public record PersonaRecord(String nombre, int edad) {
    
    
    
    // PODEMOS AÑADIR METODOS QUE MODIFICQUEN A OTRA CLASE 
    
      //leno la cafetera
    
     public void hacerCafe(Cafetera c){
     
       c.llenarCafetera();
       
       
     
     }
    
    public void beberCafe(Cafetera c, int cantidad){
    
    c.servirTaza(cantidad);
    
    
    
    }

}
