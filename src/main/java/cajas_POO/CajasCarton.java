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
    private double largo ;
    private double alto;
    private double peso;// gramos

    public CajasCarton(double ancho, double largo, double alto, double peso) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
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

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "CajasCarton{" + "ancho=" + ancho + 
                ", largo=" + largo + ", alto=" + alto + ", peso=" + peso + '}';
    }

  
    
    //apartad D
    
    public void abrir(){
    
    }
    
    public void cerrar(){
    
    }
    
    
}
