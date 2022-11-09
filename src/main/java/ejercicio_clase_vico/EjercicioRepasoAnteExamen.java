/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_clase_vico;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class EjercicioRepasoAnteExamen {

    /**
     * @param args the command line arguments
     *
     * Los clientes de una tienda casi siempre tienen descuento al llegar a
     * pagar a la caja durante la semana loca. Cuando van a pagar tienen que
     * sacar una bola de una bolsa, que es la que nos indica el descuento. Si la
     * bola es de color azul se obtiene un 20%, si es roja un 25%, si es blanca
     * no hay descuento y si es verde, se saca de la bolsa y se vuelve a sacar
     * otra de las restantes. Escribe un programa que lea el importe a pagar por
     * el cliente e imprima la bola que “sacó” de la bolsa y el importe con
     *
     * Scanner Excepciones
     *
     * si sale la verde se repite pero esta vez el sorteo de bola es sin la verde.
     */
    
     private static Scanner teclado = new Scanner(System.in);
     private static    Random numAleatorio = new Random();
     
    private static final double PORCENTAJE_DESCUENTO_BOLA_AZUL = 0.2;
       private static final double PORCENTAJE_DESCUENTO_BOLA_ROJA = 0.25;
     
     
   public static double leerDecimalesSinErroresScanner() {
        double num = 0.0;
        boolean repetir = true;

        do {
            System.out.println("Introduce el numero entero");
            try {

                num = teclado.nextDouble();
                repetir = false;

            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un numero entero");
                //limpio buffer
                teclado.nextLine();
            }

        } while (repetir);

        return num;
    }
   
    
     public static int aleatorioDentroRango(int min, int max) {
        int numeroGenerado;

        numeroGenerado = numAleatorio.nextInt(max - min + 1) + min;

        return numeroGenerado;

    }
     
     public static void muestroBolita(int numero){
         String texto="";
     
         
         switch (numero) {
             case 1 -> {
                 texto="Ha salido la bola azul";
                 System.out.println(texto);
             }
             case 2 -> {
                 texto="Ha salido la bola roja";
                 System.out.println(texto);
             }
             case 3 -> {
                 texto="Ha salido la bola blanca";
                 System.out.println(texto);
             }
             case 4 -> {
                 texto="Ha salido la bola verdel";
                 System.out.println(texto);
             }
             default -> {
             }
                 
         }
         
         
         
     
     
     
     }
     
     
     public static double aplicoDescuento( int numeroBola, double importeCompra){
         double resultado=0.0;
         
     if(numeroBola==1){
         resultado=importeCompra-(importeCompra*PORCENTAJE_DESCUENTO_BOLA_AZUL);
     
     }else if(numeroBola==2){
     
      resultado=importeCompra-(importeCompra*PORCENTAJE_DESCUENTO_BOLA_ROJA);
     }
     
     return resultado;
     
     }
    
    
    public static void main(String[] args) {
        
      
        String textoMenu = """
                                                ************************LA BOLA DE LOS DESCUENTOS*********************
                                                            Teclea   si   para otro cliente
                                                            Teclea   no  para apagar el programa
                                                  
                                                ****************************************************************************
                          """;
        String opcionMenu = " ";
        
     
        
        
        
     
        //constantes para obtener descueno
        final double PORCENTAJE_DESCUENTO_BOLA_AZULl = 0.2;
        final double PORCENTAJE_DESCUENTO_BOLA_ROJA = 0.25;
        final int RANGO_MINIMO=1;
        final int RANGO_MAXIMO=4;
        final int RANGO_MAXIMO_SIN_VERDE=3;
        //variables para realizar proceso
        int numeroBolita;
        double importeClienteSinDescuento=0.0;
        double importeClienteConDescuento=0.0;
        double importeDescontado=0.0;

        
        do {            
            System.out.println(textoMenu);
            opcionMenu=teclado.nextLine();
                if(opcionMenu.equalsIgnoreCase("si")){
                    System.out.println("Diga el importe del total comprado Y vamos a sacar una bola de la bolsa");
                    importeClienteSinDescuento=leerDecimalesSinErroresScanner();
                    teclado.nextLine();//limpieza de buffer
                    numeroBolita=aleatorioDentroRango(RANGO_MINIMO, RANGO_MAXIMO);
                    muestroBolita(numeroBolita);
                    switch (numeroBolita) {
                        case 1 -> {
                            System.out.println("Se le aplicara un descuento del 20%");
                            importeClienteConDescuento=aplicoDescuento(numeroBolita, importeClienteSinDescuento);
                    }
                        case 2 -> {
                            System.out.println("Se le aplicara un descuento del 25%");
                            importeClienteConDescuento=aplicoDescuento(numeroBolita, importeClienteSinDescuento);
                    }
                        case 3 -> System.out.println("Lo sentimos no tiene descuento");
                        case 4 -> {
                            System.out.println("Ha salido la bola verde, deje la bola fuera y vuelva a meter la mano");
                            numeroBolita=aleatorioDentroRango(RANGO_MINIMO, RANGO_MAXIMO_SIN_VERDE);
                            muestroBolita(numeroBolita);
                            if (numeroBolita==1||numeroBolita==2){
                                aplicoDescuento(numeroBolita, importeClienteSinDescuento);
                            }else if (numeroBolita==3){
                                importeClienteConDescuento=importeClienteSinDescuento;
                            }
                    }
                        default -> {
                    }
                            
                    }
                
                    System.out.println("El importe a paga con el descuento aplicado si le corresponde es de: " +importeClienteConDescuento);
                
                }
            
            
            
            
        } while (opcionMenu.equalsIgnoreCase("si")||(!opcionMenu.equalsIgnoreCase("no")));
        
        
        
        
    }

}
