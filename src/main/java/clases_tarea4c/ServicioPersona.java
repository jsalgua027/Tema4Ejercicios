/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_tarea4c;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class ServicioPersona {
    
    private static Scanner teclado = new Scanner(System.in);
    
    public static int leerEnteroSinErroresScanner() {
        int num = 0;
        boolean repetir = true;

        do {
            System.out.println("Introduce el numero entero");
            try {

                num = teclado.nextInt();
                repetir = false;

            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un numero entero");
                //limpio buffer
                teclado.nextLine();
            }

        } while (repetir);

        return num;
    }
    
      public static double leerDecimalesSinErroresScanner() {
        double num = 0.0;
        boolean repetir = true;

        do {
            System.out.println("Introduce el numero decimal");
            try {

                num = teclado.nextDouble();
                repetir = false;

            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un numero decimal");
                //limpio buffer
                teclado.nextLine();
            }

        } while (repetir);

        return num;
    }
    
    
    public static Persona pedirPersona(){
    
    Persona personaAux;
    
        System.out.println("¿Como se llama la persona?");
        String nombre = teclado.nextLine();
        System.out.println("¿Cuantos años tiene la persona?");
        int edad=ServicioPersona.leerEnteroSinErroresScanner();
        System.out.println("¿Dinos el sexo. M si es mujer; H si es hombre, O si es otro?");
        char sexo= teclado.next().charAt(0);
        System.out.println("¿Cuanto pesa la persona?");
        double peso=ServicioPersona.leerDecimalesSinErroresScanner();
        System.out.println("¿Cuanto mide la persona?");
        double altura = ServicioPersona.leerDecimalesSinErroresScanner();
        
        personaAux=new Persona(nombre, edad, sexo, peso, altura);
    
    
    return personaAux;
    
    }
    
    
    
    
    
    
}
