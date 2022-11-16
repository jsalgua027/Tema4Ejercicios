/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_tarea4c;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class ServicioPersona {
    
    private static Scanner teclado = new Scanner(System.in);
    
    
    public static Persona pedirPersona(){
    
    Persona personaAux;
    
        System.out.println("¿Como se llama la persona?");
        String nombre = teclado.nextLine();
        System.out.println("¿Cuantos años tiene la persona?");
        int edad=teclado.nextInt();
        System.out.println("¿Dinos el sexo. M si es mujer; H si es hombre, O si es otro?");
        char sexo= teclado.next().charAt(0);
        System.out.println("¿Cuanto pesa la persona?");
        float peso=teclado.nextFloat();
        System.out.println("¿Cuanto mide la persona?");
        double altura = teclado.nextDouble();
        
        personaAux=new Persona(nombre, edad, sexo, peso, altura);
    
    
    return personaAux;
    
    }
    
    
    
    
    
    
}
