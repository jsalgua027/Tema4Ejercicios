/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafetera_ejericio4E;

/**
 *
 * @author nacho
 */
public class PruebaCafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // cafetera a la mitad
       Cafetera cafetera1= new Cafetera(1000, 500);
       // cafetera llena para intentar  probar los metodos 
       Cafetera cafetera2 = new Cafetera(2000, 2000);
       
       // cafetera vacia 
         Cafetera cafetera3 = new Cafetera(4000, 0);
         Cafetera cafetera4= new Cafetera();
         
         // Persona 
         
         Persona p1= new Persona("Nacho", 40);
         
         
         
         System.out.println("Cojo la cafetera vacia (cafetera3) y la lleno atraves de la persona");
         System.out.println("La cafetera3 como esta actualmente: "+ cafetera3.getCantidadActual());
         p1.hacerCafe(cafetera3);
         System.out.println("Como esta cafetera 3 actualmente: " + cafetera3.getCantidadActual());
         System.out.println("Voy a usar cafetera 3 para servir una taza atraves de la persona");
         p1.beberCafe(cafetera3, 2000);
         System.out.println("La cafetera 3 despues de servir el cafe tiene: " +cafetera3.getCantidadActual());
         
         
         System.out.println("********************pruebo los metodos de la clase cafetera ********");
         System.out.println("La cafetera 1 esta asi: "+ cafetera1.toString());
         System.out.println("a cafetera 1 le voy a agregar cafe, le"
                 + " voy a dar mas cantidad de la cantidad maxima, solo se llenara a la maxima");
         cafetera1.agregarCafe(3000);
         System.out.println("despues de agregarle 3000 su cantidad actual es: " +cafetera1.getCantidadActual());
         
         
         System.out.println("Voy hacer una copia de la cafetera 2 y uso el metodo equals");
         cafetera4.copia(cafetera2);
         System.out.println("la cafetera cuatro es: " + cafetera4);
         
         System.out.println("Son iguales las cafetera 2 y la 4:"  + cafetera2.equals(cafetera4));
         
         
         
    }
    
}
