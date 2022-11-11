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
        
            CajasCarton cajaGrande = new CajasCarton(250, 500, 400, 200);
            CajasCarton cajaChica = new CajasCarton(25, 15, 30, 17);
            
           System.out.println("El ancho es :"+ cajaGrande.getAncho()+ " milimetros");
           System.out.println("El largo  es :"+ cajaGrande.getLargo()+ " milimetros");
           System.out.println("El alto  es :"+ cajaGrande.getAlto()+ " milimetros");
           System.out.println("pesa :"+ cajaGrande.getPeso()+ " gramos");
            System.out.println("****************************caja chica***********");
             System.out.println("El ancho es :"+ cajaChica.getAncho()+ " milimetros");
           System.out.println("El largo  es :"+ cajaChica.getLargo()+ " milimetros");
           System.out.println("El alto  es :"+ cajaChica.getAlto()+ " milimetros");
           System.out.println("pesa :"+ cajaChica.getPeso()+ " gramos");
            
           
           System.out.println("***********************TO STRING");
           
           
           
           
           
           
           
           
           
        
    }
    
}
