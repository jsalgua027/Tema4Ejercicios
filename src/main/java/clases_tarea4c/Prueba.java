/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases_tarea4c;

/**
 *
 * @author Windows10
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  //   Persona persona1  =   ServicioPersona.pedirPersona();
  
    boolean esMayorEdad;
    float indiceMasa;
        
        Persona persona2=new Persona("juan ", 23, 'H', 80f, 1.75);
        Serie juegoTronos =new Serie("Juego de Tronos", "fantasia", "JJJJJJJJJJJJJ", "HBO", 5, 100);
        
        System.out.println("**************************Muestro persona 1*************");
     //   System.out.println(persona1);
        System.out.println("**************************Muestro persona 2**************");
        
        System.out.println(persona2);
        esMayorEdad=persona2.esMayorEdad();
        System.out.println("Es mayor de edad? " + esMayorEdad);
        indiceMasa=persona2.calcularIMC();
        System.out.println("Su indice de Masa Corporal es: " + indiceMasa);
        persona2.estadoIMC(indiceMasa);
        
        System.out.println("*******************************Muestro Serie creada*********");
        System.out.println(juegoTronos);
        persona2.darlikeSerie(juegoTronos);
        System.out.println("El número de likes es ahora de: "+ juegoTronos.getNumeroLikes());
        
        
    }
    
}
