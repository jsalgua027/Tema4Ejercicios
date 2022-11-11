/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajas_POO;

/**
 *
 * @author nacho
 */
public class TestCajasCarton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            CajasCarton cajaGrande = new CajasCarton(250, 400, 500, 200);
            CajasCarton cajaChica = new CajasCarton(25, 30, 15, 17);
            
           System.out.println("El ancho es: "+ cajaGrande.getAncho()+ " milimetros");
           System.out.println("La altura es: "+ cajaGrande.getAlto()+ " milimetros");
           System.out.println("El largo  es: "+ cajaGrande.getLargo()+ " milimetros");
           System.out.println("pesa: "+ cajaGrande.getPeso()+ " gramos");
            System.out.println("****************************caja chica***********");
             System.out.println("El ancho es: "+ cajaChica.getAncho()+ " milimetros");
           System.out.println("La Altura es: "+ cajaChica.getAlto()+ " milimetros");
           System.out.println("El largo es: "+ cajaChica.getLargo()+ " milimetros");
           System.out.println("pesa: "+ cajaChica.getPeso()+ " gramos");
            
           
           System.out.println("***********************TOSTRING**********************");
           System.out.println("CajaChica: ");
           System.out.println(cajaChica.toString());
           
           System.out.println("************************************************************");
           System.out.println("CajaGrande: ");
           System.out.println(cajaGrande.toString());
           
           
           
           
           
           
        
    }
    
}
