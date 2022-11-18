/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentaBancaria;

/**
 *
 * @author nacho
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Cuenta pepe = new Cuenta("7586488N", "Pepe", 5000, 0.5);
       
        System.out.println(pepe);
        
        CalculosCuenta.ingresarDinero(pepe, 2500);
        System.out.println("Miro los ingresos");
        System.out.println(pepe);       
        System.out.println("retiro mas de lo que tienen en cuenta:");
        CalculosCuenta.retirarDinero(pepe, 100000);
        System.out.println("retiro la cantidad correcta ");
        CalculosCuenta.retirarDinero(pepe, 3000);
        System.out.println(pepe);
        System.out.println("genero los intereses ");
        CalculosCuenta.ingresarIntereses(pepe);
        System.out.println(pepe);
        
        
    }
    
}
