/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales;

import java.time.LocalDate;

/**
 *
 * @author Windows10
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     LocalDate fechaA1 = LocalDate.of(2017, 11, 18);
     LocalDate fechaA2 = LocalDate.of(2020, 8, 10);
     
   
        Animal a1 = new Animal(fechaA1, "Pluto", "Perro", 300, "dormido");
        Animal a2 = new Animal(fechaA2, "Luna", "Gata", 200, "dormido");
        
        Persona p1 = new Persona("Juan", 30);
        Persona p2 = new Persona("Maria", 20);
        System.out.println("Imprimo Animal 1******************************");
        System.out.println(a1);
        System.out.println("Imprimo Animal 2******************************");
        System.out.println(a2);
        p1.llamar(a1);
        p1.llamar(a2);
        System.out.println("He llamado a los dos animales compruebo estado");
        System.out.println("El estado del animal a1: "+ a1.getEstado());
        System.out.println("El estado del animal a2: "+ a2.getEstado());
        
        
        Animal a3 = new Animal();
        
        a3.clonar(a2);
        
        System.out.println(" Clono animal 2 en 3 imprimo 3 para ver resultados");
        System.out.println(a3);
        
        
    }
    
}
