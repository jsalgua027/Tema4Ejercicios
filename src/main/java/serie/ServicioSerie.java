/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serie;

import java.util.Scanner;

/**
 *
 * @author nacho
 *
 * me sirve de conexion entre el main y mi clase serie
 */
public class ServicioSerie {

    private static Scanner teclado = new Scanner(System.in);

    // meotod que lee por teclado los datos de una serie y devulve el objeto creado
    public static Serie leeTecladoSerie() {
        // creamos el objeto
        Serie serie ;
        //leeemos por teclado
        System.out.println("Nombre de la serie");
        String nombreSerie = teclado.nextLine();
        System.out.println("Nombre del genero");
        String generoSerie = teclado.nextLine();
        System.out.println("Nombre del productor");
        String productorSerie = teclado.nextLine();
        System.out.println("Describe la sinopsis");
        String sinopsis = teclado.nextLine();
        System.out.println("Numero de temporadas");
        int numeroTemporadas = teclado.nextInt();
        System.out.println("Numero de likes");
        int numeroLikes = teclado.nextInt();
        teclado.nextLine();// limpio buffer
        //instanciamos el objeto
        serie=new Serie(nombreSerie, generoSerie, sinopsis, productorSerie
                , numeroTemporadas, numeroLikes);
        
        
        
        //devolvemos el tipo de serie

        return serie;
    }

    
    public static  void darLike(Serie serie){
    
        System.out.println("te ha gustado la serie "+ serie.getTitulo()+ " ?");
        String respuesta = teclado.nextLine();
        
        if(respuesta.equalsIgnoreCase("si")){
        
        serie.darlike();
        
        }
    
    }
    
    
    
}
