/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales;

import animales.clases_enum.EstadoAnimal;
import animales.clases_enum.TipoAnimal;
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
     
   
        Animal a1 = new Animal(fechaA1,"Pluto",TipoAnimal.GATO, 200, EstadoAnimal.JUGANDO);
        Animal a2 = new Animal(fechaA2, "Duke", TipoAnimal.LAGARTO, 300, EstadoAnimal.JUGANDO);
       
        
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
        
         // Inicializo el objeto animal pero con el metodo hago el new
        Animal a3 =Animal.clonar(a2);
        
       
        
        System.out.println(" Clono animal 2 en 3 imprimo 3 para ver resultados");
        System.out.println(a3);
        System.out.println("P2 juega con a2 durante 120 minutos");
        p2.jugar(a2, 120);
        System.out.println("Como esta a2 de peso despues de jugar  "+ a2.getPeso());
        
        System.out.println("p1 alimenta a  a1 con 1000 gramos");
        p1.alimentar(a1, 1000);
        System.out.println("El peso de a1 es de: "+ a1.getPeso());
        System.out.println("p1 debe de jugar con a1 200 minutos.");
        p1.jugar(a1, 200);
        
        
    }
    
}
