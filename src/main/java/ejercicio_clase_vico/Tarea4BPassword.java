/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejercicio_clase_vico;

/**
 *
 * @author nacho
 *
 *
 *
 * Vamos a realizar una aplicación para generar contraseñas y números pin. La
 * aplicación tendrá tres opciones: la primera, genera números pin aleatorios
 * para tarjetas SIM de teléfonos móviles; la segunda opción genera contraseñas
 * para usuarios de un sistema operativo con 8 caracteres, incluyendo números y
 * letras; la tercera opción, genera una secuencia de "n" caracteres aleatorios
 * de un conjunto que tú elijas (debes pasar un array de char de 10 elementos).
 * El número "n" se debe solicitar por teclado. Se deben crear, al menos, tres
 * métodos de clase para generar las secuencias de cada opción.
 *
 * Para simplificar nuestra aplicación y no tener que inventar la rueda, vamos a
 * usar una librería que no forma parte de la API de Java. Para incluir la
 * librería en el proyecto hay que seguir los siguientes pasos. *
 *
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.commons.lang3.RandomStringUtils; // una vez añadido 

public class Tarea4BPassword {

    private static Scanner teclado = new Scanner(System.in);
    private static final String MENU_INICIAL = """
                                   
                                            ************************************************
                                   
                                                 1.Para generar números aleatorios para pin de movil
                                                 2.Para genera contraseñas de 8 caracteres incluendo numeros y letras
                                                 3.Generar secuencia de N caracteres aleatorios de un conjunto
                                                 4.Para salir del programa          
                                   
                                   """;

    private static int flitroOpcionMenu() {
        int opcion = 0;
        boolean repetir = true;
        do {            
            
              do {
            System.out.println("Introduce el numero de opcion a elegir");
            try {

                opcion = teclado.nextInt();
                repetir = false;

            } catch (InputMismatchException ime) {
                System.out.println("el dato introducido es erroneo");
                //limpio buffer
                teclado.nextLine();
            }

        } while (repetir);
              
        } while (opcion>=5);
      

        return opcion;

    }

    private static int pidoMenu() {
        int opcion = 0;
        boolean repetir = true;

        System.out.println(MENU_INICIAL);
        opcion = flitroOpcionMenu();

        return opcion;
    }

    private static int numeroDigitosPin() {
        int opcion = 0;
        boolean repetir = true;

        do {
            System.out.println("¿Cuantos digitos quieres que tenga  tú código Pin?");
            try {

                opcion = teclado.nextInt();
                repetir = false;

            } catch (InputMismatchException ime) {
                System.out.println("el dato introducido es erroneo");
                //limpio buffer
                teclado.nextLine();
            }

        } while (repetir);

        return opcion;

    }

    private static int cantidadCaracteresPedidos() {
        int opcion = 0;
        boolean repetir = true;

        do {
            System.out.println("¿Cuantos caracteres quieres que tenga la clave?");
            try {

                opcion = teclado.nextInt();
                repetir = false;

            } catch (InputMismatchException ime) {
                System.out.println("el dato introducido es erroneo");
                //limpio buffer
                teclado.nextLine();
            }

        } while (repetir);

        return opcion;

    }

    private static String generadorSecuencia(char[] arrayAux) {
        String aux = "";
        int cantidad = 0;

        cantidad = cantidadCaracteresPedidos();
        aux = RandomStringUtils.random(cantidad, arrayAux);

        return aux;
    }

    public static void main(String[] args) {

//*******************************Ejemplos vico****************************************************
//        // opcion 1 es un pin de 4 digitos hago 10 de muestra
//        for (int i = 0; i < 10; i++) {
//            String pin = RandomStringUtils.randomNumeric(4);
//            System.out.println(pin);
//        }
//        // opcion 2genero contarseñas con numero y letras hago 10 de muestra
//        
//        for (int i = 0; i < 10; i++) {
//             String password = RandomStringUtils.randomAlphanumeric(8);
//             System.out.println(password);
//        }
//       
//        // opcion 3 genera una secuencia de N aleatotios de una secuencia que elijas
//        int numero = 6; //numero de carateres que quiero que tenga la clave
//        char[] conjuntoCarateres={'a', 'z', 'b', '@', '$', '%','1','3'};
//        for (int i = 0; i < 10; i++) {
//              String password2=RandomStringUtils.random(numero, conjuntoCarateres);
//              System.out.println(password2);
//        }
//      
        //***********************EJECICIO***************************************
        int seleccionMenu = 0;
        int cantidadDigitosPin = 0;
        int cantidadCaracteres = 0;
        String password = "";
        String pin = "";
        String passwordOpcion3 = "";
        char[] conjuntoCaracteres = {'1', '2', '4', '9', 'a', 't', 'r', '@', '&', 'k'};

        do {
            seleccionMenu = pidoMenu();

            switch (seleccionMenu) {
                case 1 -> {
                    cantidadDigitosPin = numeroDigitosPin();
                    pin = RandomStringUtils.randomNumeric(cantidadDigitosPin);
                    System.out.println(" El numero pin con la cantidad de: " + cantidadDigitosPin + " digitos que ha indicado es: " + pin);
                    break;
                }
                case 2 -> {
                    cantidadCaracteres = cantidadCaracteresPedidos();
                    password = RandomStringUtils.randomAlphanumeric(cantidadCaracteres);
                    System.out.println(" La clave generada de : " + cantidadCaracteres + " caracteres es: " + password);
                    break;
                }
                case 3 -> {
                    passwordOpcion3 = generadorSecuencia(conjuntoCaracteres);
                    System.out.println("La clave generada es : " + passwordOpcion3);
                    break;
                }
                case 4 -> {
                    System.out.println(" Ha seleccionado salir............Adios");
                    break;
                }
                default -> {
                }

            }

        } while ((seleccionMenu >= 1 && seleccionMenu <= 3));
    }
}
