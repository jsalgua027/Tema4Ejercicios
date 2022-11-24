/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales.clases_enum;

/**
 *
 * @author nacho
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EstadoAnimal estadoPerro=EstadoAnimal.COMIENDO;
        
        System.out.println("EStado perro tiene de codigo "+ estadoPerro.getCodigoEstado());
        System.out.println("EStado perro tiene de descripción "+ estadoPerro.getEstado());
    }
    
}
