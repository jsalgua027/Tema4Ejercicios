/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_tarea4c;

import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nacho
 */
public class Persona {

    private static Random numAleaorio = new Random();
    private String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    private String nombre;
    private int edad;
    private final String NIF = generarNIF();
    private char sexo; // H gombre , M mujer , O otros
    private float peso;
    private double altura;

    // constructor por defectos 
    public Persona() {
    }

    // constructor parametrizado
    public Persona(String nombre, int edad, char sexo, float peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        if (!filtrarSexo(sexo)) {
            sexo = 'o';
        }
        this.sexo = sexo;
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

    public String getNIF() {
        return NIF;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
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
        if (!filtrarSexo(sexo)) {
            sexo = 'o';
        }
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" + ", nombre=" + nombre + ", edad=" + edad
                + ", NIF=" + NIF + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    // Métodos solicitados
    // filtro sexo
    private boolean filtrarSexo(char sexo) {
        boolean siEs = true;
        if (Character.compare(sexo, 'M') == 0 || (Character.compare(sexo, 'H')) == 0 || (Character.compare(sexo, 'O')) == 0) {
            return siEs = true;

        }
        return siEs = false;

    }

    //generar NIF 
    private String generarNIF() {
        String resultado = "";
        String numeroString = RandomStringUtils.randomNumeric(8);
        int numerosInt = Integer.parseInt(numeroString);
        int posicion = numerosInt % 23;
        resultado = numeroString + letras.charAt(posicion);
        return resultado;

    }
    //si es mayor de edad devuleve true

    public boolean esMayorEdad() {

        if (this.edad >= 18) {
            return true;
        }
        return false;

    }

    public float calcularIMC() {
        float inidiceMasaC = 0;
        // double indiceDouble = this.peso / Math.pow(this.altura, 2); esta opcion es si peso es double
        //   inidiceMasaC = (float) indiceDouble;
        inidiceMasaC = this.peso / (float) Math.pow(this.altura, 2);
        return inidiceMasaC;

    }

    // metodo para saber el estado según IMC
    public void estadoIMC(Float inidiceM) {
        if (inidiceM > 18 && inidiceM <= 24) {

            System.out.println("Su peso es normal ");
        } else if (inidiceM >= 25 && inidiceM <= 29) {

            System.out.println("Esta en sobrepeso");

        } else if (inidiceM > 29) {

            System.out.println("Es un obeso pongase a dieta y vaya el GYM");
        } else if (inidiceM < 18) {

            System.out.println("Necesita un buen cocido madrileño con pringada");
        }

    }
    
    
      //metodo dar like a serie que recibe la serie por parametros
     public  void darlikeSerie(Serie serie) {
       serie.darlike();
        
     

    }
    
    

}