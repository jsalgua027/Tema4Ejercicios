/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculoPOO;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class MisVehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //instancia de la clase scanner
      Scanner teclado= new Scanner(System.in);
      //instancia de la clase vehiculo, llamada v1
       Vehiculo v1= new Vehiculo();
       v1.setMatricula("1234RR");
       v1.setColor("Verde");
        System.out.println("Matricula de v1 " +v1.getMatricula());
        
        Vehiculo ferrari=new Vehiculo();
        ferrari.setColor("Rosa chicle");
        ferrari.setModelo("testarrosa");
        ferrari.setMarca("ferrari");
        System.out.println("Color del ferrari " + ferrari.getColor());
        // instanciamos nueva clase vehiculo con el construcctor parametrizadp
        Vehiculo mercedes = new Vehiculo("1111AAA","ADFTHGU123", "Mercedes", 
                "A1", "Negro", 23.50, true);
        System.out.println("Mercedes tarifa " + mercedes.getTarifa());
        
        System.out.println("el color del mercedes es: "+mercedes.getColor());
        
        System.out.println("******************Hago cambios con el metodo , cambio color*********");
        mercedes.setColor("Azul");
        
        System.out.println("El color del mercedes es: "+ mercedes.getColor());
        
        System.out.println(mercedes.toString());
        
        
        
        System.out.println("******Ejercicio 11 voy a crear un alias***********");
        
        Vehiculo mercedes2;
        
            mercedes2=mercedes; // ferrari 2  es un alias de ferrari ( en otro nombre hago referencia al objeto)
            System.out.println("Imprimo mercedes 2 para ver los atributos");
            System.out.println(mercedes2.toString());
        
        
    }
    
}
