/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafetera_ejericio4E;

/**
 *
 * @author jsalc
 *
 *
 * Desarrolla una clase Cafetera con atributos capacidadMaxima (la cantidad
 * máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
 * actual de café que hay dentro de la cafetera). Implementa, al menos, los
 * siguientes métodos: Constructor predeterminado, sin parámetros: establece la
 * capacidad máxima en 1000 (c.c.) y la cantidad actual en cero (cafetera
 * vacía). Constructor, que recibe sólo la capacidad máxima de la cafetera;
 * inicializa la cantidad actual de café igual a la capacidad máxima (cafetera
 * llena). Constructor, que recibe la capacidad máxima y la cantidad actual. Si
 * la cantidad actual que se pasa es mayor que la capacidad máxima de la
 * cafetera, se ajustará la cantidad actual a la capacidad máxima.
 * llenarCafetera(): hace que la cantidad actual sea igual a la capacidad.
 * servirTaza(double cantidadAServir): simula la acción de servir una taza con
 * la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar
 * la taza, se sirve lo que quede. vaciarCafetera(): pone la cantidad de café
 * actual en cero. agregarCafe(double cantidadAgregar): añade a la cafetera la
 * cantidad de café indicada, teniendo en cuenta que la cafetera no puede
 * rebosar.
 *
 *
 */
public class Cafetera {

    private double capacidadMaxima; //capaciad máxima que puede contener la cafetera
    private double cantidadActual;

    
    
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;

        if (cantidadActual > this.capacidadMaxima) {
            cantidadActual = this.capacidadMaxima;
        }
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }

    // llenar cafetera
    public void llenarCafetera() {

        this.cantidadActual = this.capacidadMaxima;

    }

    //servirTaza(double cantidadAServir): simula la acción de servir una taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
    public void servirTaza(double cantidadAservir) {
        if (cantidadAservir > this.cantidadActual) {
            this.cantidadActual = 0;
         
        } else {

            this.cantidadActual = this.cantidadActual - cantidadAservir;
        }

    }

    public void vaciarCafetera() {
        this.cantidadActual = 0;

    }

    public void agregarCafe(double cantidadAgregar) {
        if (cantidadAgregar + this.cantidadActual > this.capacidadMaxima) { //si se supera la cantidad maxima solo lo lleno hasta la maxima
            this.cantidadActual = this.capacidadMaxima;
            System.out.println("Quieres llenar mas de lo que puede, lo llenas a la capazidad maxima nada mas");

        } else {//sino pues la cantidad actal es la suma de la canitdad agragada con la que habia
            this.cantidadActual = this.cantidadActual + cantidadAgregar;

        }

    }
    
    
    // metodo copia cafetera para probar el equals
    
    public Cafetera copia( Cafetera origen){
    
    Cafetera aux= new Cafetera(origen.getCapacidadMaxima(), origen.getCantidadActual());
        
        return aux;
    }
    
    //solo considero como dato necesario para la comparacion la capacidad maxima

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.capacidadMaxima) ^ (Double.doubleToLongBits(this.capacidadMaxima) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cafetera other = (Cafetera) obj;
        return Double.doubleToLongBits(this.capacidadMaxima) == Double.doubleToLongBits(other.capacidadMaxima);
    }
    
    
    
    
    

}
