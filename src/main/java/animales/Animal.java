/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

import animales.clases_enum.EstadoAnimal;
import animales.clases_enum.TipoAnimal;
import java.time.LocalDate;

/**
 *
 * @author nacho
 */
public class Animal {

    private LocalDate fechaNacimiento;
    private String nombre;
    private TipoAnimal tipoAnima;
    private double peso;
    private EstadoAnimal estado;

    public Animal() {
    }

    public Animal(LocalDate fechaNacimiento, String nombre, TipoAnimal tipoAnimal, double peso, EstadoAnimal estadoAnimal) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipoAnima = tipoAnimal;
        this.peso = peso;
        this.estado = estadoAnimal;
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

    public TipoAnimal getTipoAnima() {
        return tipoAnima;
    }

    public void setTipoAnima(TipoAnimal tipoAnima) {
        this.tipoAnima = tipoAnima;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public EstadoAnimal getEstado() {
        return estado;
    }

    public void setEstado(EstadoAnimal estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Animal{" + "fechaNacimiento=" + fechaNacimiento
                + ", nombre=" + nombre + ", tipoAnima=" + tipoAnima
                + ", peso=" + peso + ", estado=" + estado + '}';
    }

    public void comer(double cantidadGramos) {
        double aux = Math.abs(cantidadGramos);
        this.peso = this.getPeso() + aux;

    }

    public void dormir() {
        this.estado = EstadoAnimal.DURMIENDO;

    }

    public void despertar() {
        this.estado = EstadoAnimal.DESPIERTO;

    }

    public void descansar() {
        this.estado = EstadoAnimal.DURMIENDO;

    }
    //metodo jugar

    public void jugar(int cantidadMinutos) {
        int minutos = Math.abs(cantidadMinutos);

        if (minutos < 30) {
            this.peso = this.peso - 10;

        }
        if (minutos > 180) {

            throw new IllegalArgumentException("No puede jugar mas de 180 minutos");

        } else if (minutos > 30 && minutos <= 180) {

            this.peso = this.peso - ((minutos / 30) * 20);
        }

    }

    // metodo clonar 
    public static Animal clonar(Animal pet) {

        Animal aux = new Animal();

        try {
            aux.setEstado(pet.getEstado());
            aux.setFechaNacimiento(pet.getFechaNacimiento());
            aux.setNombre(pet.getNombre());
            aux.setPeso(pet.getPeso());
            aux.setTipoAnima(pet.getTipoAnima());

        } catch (NullPointerException npe) {
            System.out.println("No puede haber nada a nulo");

        }

        return aux;

    }
    // version 2 del metodo clonar con otra forma de controlar nullPointer

    public static Animal clonar2(Animal pet) {
        Animal aux = new Animal();
        if (pet != null) {
            aux.setEstado(pet.getEstado());
            aux.setFechaNacimiento(pet.getFechaNacimiento());
            aux.setNombre(pet.getNombre());
            aux.setPeso(pet.getPeso());
            aux.setTipoAnima(pet.getTipoAnima());

        } else {
            aux = new Animal();
        }
        return aux;
    }

}
