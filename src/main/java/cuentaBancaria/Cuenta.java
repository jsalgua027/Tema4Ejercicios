/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentaBancaria;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author nacho
 *
 *
 * atributos n de cuenta (20 digitos) nif cliente nombre cliente saldo actual
 * intereses %(entre 0.1 y 3)
 *
 *
 * ****metodos*****
 *
 * construcutor por defecto n cuenta aleatorio construcutor parametrizado n
 * cuenta aleatorio getter y setter, no hay set para cuenra tostring
 *
 * ****************clase calculos cuenta*******
 *
 * metodos ingresar intereses (Cuenta cuenta). Aumenta el saldo de la cuenta
 * saldo= saldo+saldo *intereses ingresarDinero (Cuenta cuenta, Double cantidad)
 * retirarEfectivo(Cuenta cuenta, double cantidad).Hay que tener en cuenta que
 * no se puede retirar mas saldo del actual
 *
 * ************clase prueba*************** probar todos los metodos
 *
 *
 *
 */
public class Cuenta {

    private final String NUMEROCUENTA;
    private String NifCliente;
    private String nombreCliente;
    private double saldoActual;
    private double intereses;

    public Cuenta() {
         this.NUMEROCUENTA = RandomStringUtils.randomAlphanumeric(20);
    }

    public Cuenta(String NifCliente, String nombreCliente, double saldoActual, double intereses) {
        this.NUMEROCUENTA = RandomStringUtils.randomAlphanumeric(20);
        this.NifCliente = NifCliente;
        this.nombreCliente = nombreCliente;
        this.saldoActual = saldoActual;
        if (this.intereses >= 0.1 && this.intereses <= 3) {

            this.intereses = intereses;
        }
        this.intereses = 0.1;
    }

    public String getNumeroCuenta() {
        return NUMEROCUENTA;
    }

    public String getNifCliente() {
        return NifCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setNifCliente(String NifCliente) {
        this.NifCliente = NifCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setIntereses(double intereses) {
        if (this.intereses >= 0.1 && this.intereses <= 3) {

            this.intereses = intereses;
        }
        this.intereses = 0.1;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + NUMEROCUENTA + ", NifCliente=" + NifCliente +
                ", nombreCliente=" + nombreCliente + ", saldoActual=" + saldoActual +
                ", intereses=" + intereses + '}';
    }

    
    
    
    
}
