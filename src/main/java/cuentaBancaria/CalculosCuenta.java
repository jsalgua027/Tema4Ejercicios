/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentaBancaria;

/**
 *
 * @author nacho
 * 
 * 
 * 
 * metodos ingresar intereses (Cuenta cuenta). Aumenta el saldo de la cuenta
 * saldo= saldo+saldo *intereses i
 * 
 * 
 * ngresarDinero (Cuenta cuenta, Double cantidad)
 * retirarEfectivo(Cuenta cuenta, double cantidad).Hay que tener en cuenta que
 * no se puede retirar mas saldo del actual
 * 
 */
public class CalculosCuenta {
    
    public static void ingresarIntereses(Cuenta cuenta){
    
    cuenta.setSaldoActual(cuenta.getSaldoActual()+(cuenta.getSaldoActual()*cuenta.getIntereses()));
    
    }
    
    public static void ingresarDinero(Cuenta cuenta, double cantidad){
    
        cuenta.setSaldoActual(cuenta.getSaldoActual()+Math.abs(cantidad));
        
        
    }
    
    public static void retirarDinero(Cuenta cuenta, double cantidad){
          cantidad=Math.abs(cantidad);
        if(cantidad>cuenta.getSaldoActual()){
            System.out.println("No se puede retirar ese importe, estas tieso");
        
        } else{
            cuenta.setSaldoActual(cuenta.getSaldoActual()-cantidad);
        }
    
    }
    
}
