/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_tarea4c;

import java.util.Random;

/**
 *
 * @author nacho
 */
public class Persona {
    
    private static Random numAleaorio = new Random();
    
    private String  nombre;
    private int edad;
    private   String NIF;
    private char sexo; // H gombre , M mujer , O otros
    private double peso;
    private double altura;

    // constructor por defectos 
    
    public Persona() {
    }
    
    // constructor parametrizado

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        if(!filtrarSexo(sexo)){
        sexo='o';
        }
        this.sexo=sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public static Random getNumAleaorio() {
        return numAleaorio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public  String getNIF() {
        return NIF;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public static void setNumAleaorio(Random numAleaorio) {
        Persona.numAleaorio = numAleaorio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
       if(!filtrarSexo(sexo)){
        sexo='o';
        }
        this.sexo=sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
    
    
    // filtro sexo
    
    public boolean filtrarSexo(char sexo){
    boolean siEs=true;
    if (Character.compare(sexo, 'M') ==0|| (Character.compare(sexo, 'H'))==0||(Character.compare(sexo, 'O'))==0){
    return siEs=true;
    
    }
    return siEs=false;
    
    
    
    }
         
    
    
    
    
}
