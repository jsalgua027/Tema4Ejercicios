/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serie;

/**
 *
 * @author nacho
 */
public class MisSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Serie simpson = new Serie("los simpsons","comedia",".....", "FOX", 1000);
      
        System.out.println(simpson);
        
        Serie house = new Serie();
        
        System.out.println(house);
        
        Serie prisionBreak = new Serie("PrisionBreak", "accion",
                ".....", "ni idea", 5, 120000);
        
        System.out.println(prisionBreak);
        
        // creo un objeto leyendo los datos por teclado.
        
       // Serie peakBlinders= ServicioSerie.leeTecladoSerie();
        
      //  System.out.println(peakBlinders);
        
        ServicioSerie.darLike(prisionBreak);
      //  ServicioSerie.darLike(peakBlinders);
        
        
      //  System.out.println(peakBlinders);
        System.out.println(prisionBreak);
        
      
      
    }
    
}
