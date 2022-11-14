/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajas_POO;

/**
 *
 * @author nacho
 */
public class CajasCarton {

    /**
     * @param args the command line arguments
     */
   
    private double ancho;//milimetros
    private double alto;
    private double largo;
    private double peso;// gramos

    public CajasCarton(double ancho, double alto, double largo, double peso) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.peso = peso;
    }

    public CajasCarton() {
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
//metodo sobreescrito que  es heredado de otra clase  y llamandose igual pero realiza otro comportamiento
    @Override
    public String toString() {
        return "CajasCarton{" + "ancho=" + ancho +" mm "+ ", alto=" + alto +" mm "
                + ", largo=" + largo +" mm "+ ", peso=" + peso +" gramos " +'}';
    }

  

  
    
    //apartad D
    
    public void abrir(){
    
    }
    
    public void cerrar(){
    
    }
    
    
}
