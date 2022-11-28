/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_record;

/**
 *
 * @author Windows10
 */
public class Prueba_Record {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaDTO p1 = new PersonaDTO("Nacho", "Salcedo", 41);
        PersonaDTO p2 = new PersonaDTO("Pepe", "Perez ", 20);
        
        System.out.println(p1);
        System.out.println("La edad de p1: " + p1.edad());
        System.out.println(" El nombre de p1 es: "+ p1.nombre());
        
    }
    
}
