/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

import java.time.LocalDate;

/**
 *
 * @author nacho
 */




public class Animal {
    
    private  LocalDate fechaNacimiento;
    private String nombre;
    private String tipoAnima;
    private double peso;
    private String estado;

    public Animal() {
    }

    public Animal(LocalDate fechaNacimiento, String nombre, String tipoAnima, double peso, String estado) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipoAnima = tipoAnima;
        this.peso = peso;
        this.estado = estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAnima() {
        return tipoAnima;
    }

    public void setTipoAnima(String tipoAnima) {
        this.tipoAnima = tipoAnima;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Animal{" + "fechaNacimiento=" + fechaNacimiento + 
                ", nombre=" + nombre + ", tipoAnima=" + tipoAnima +
                ", peso=" + peso + ", estado=" + estado + '}';
    }
    
    
    public void comer (double cantidadGramos){
           double  aux= Math.abs(cantidadGramos);
        this.peso= this.getPeso()+aux;
    
    
    }
    
    
    public void dormir(){
    this.estado="Dormido";
    
    }
    
     public void despertar(){
    this.estado="Despierto";
    
    }
     public void descansar(){
    this.estado="Descansar";
    
    }
     
     
}
