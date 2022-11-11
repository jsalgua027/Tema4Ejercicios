/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculoPOO;

/**
 *
 * @author nacho
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
  /*
     * @param args the command line arguments
     * 
     * 
     * verbos: accionees metodos
     * 
     * 
     *- ¿Qué es un programa orientado a objetos?
     * es la interacion que existe entre nuestros objetos metidos en diferentes clases
       -¿Qué es una clase?
      * es un molde donde vamos a indicar los atributos y los métodos de los objetos que queremos modelar
       - ¿Qué es un objeto?
        * es una variable(no de tipo primitivo), es de tipo referencia que contoenen los datos concretos de la instancia de una clase
        * ¿instancia de una clase?
        ¿Cuáles son los pilares de la POO? Explica brevemente cada uno de ellos.
        * definicion, 
        * atributos metodos
        ¿Qué ventajas aporta la POO?
        ¿Cuáles son las partes de una clase?
        ¿Qué elementos componen la definición de una clase? Explica brevemente cada uno
        ¿Qué es un método constructor?
        ¿Qué son los métodos de consulta o getters?
        ¿Qué son los métodos modificadores o setters?
        ¿En qué consiste la instanciación de un objeto? ¿Para qué sirve el operador ‘new’?
        ¿Cuál es la función del método main()? ¿Cómo se declara el método main()?
        ¿Cómo interaccionan los objetos de una aplicación?

     * 
     * 
     * 
     */
//definicion de la clase vehiclu
public class Vehiculo {
// atributos
    private String matricula ;
    private String bastidor;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;//precio día
    private boolean disponible;// Alquilado o libre
    
    //Constructores

    public Vehiculo(String matri, String basti, String mar, String model, String col, double tarif, boolean dispon) {
        this.matricula = matri;
        this.bastidor = basti;
        this.marca = mar;
        this.modelo = model;
        this.color = col;
        this.tarifa = tarif;
        this.disponible = dispon;
    }

    public Vehiculo() {
    }
    
    //constructor con tres parametros 
    public Vehiculo (String matricula, String bastidor, String marca){
    this.matricula=matricula;
    this.bastidor=bastidor;
    this.marca=marca;
    
    // el resto de atributos se quedan  null objetos, o para numeros, false booleanos
   
  
    }

    //Metodos getter
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }
// metodos setter
    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", bastidor=" + bastidor + 
                ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + 
                ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }

    
    
    
}
