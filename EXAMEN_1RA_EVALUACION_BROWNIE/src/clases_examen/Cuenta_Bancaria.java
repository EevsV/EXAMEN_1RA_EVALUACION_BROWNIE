/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;

/**
 *
 * @author Fabian b
 */
public class Cuenta_Bancaria {
    private String numeroCuenta;
    private String nombreCliente;
    private double saldo;
    
    public Cuenta_Bancaria() {
        this.numeroCuenta = "";
        this.nombreCliente = "";
        this.saldo = 0;
    }
    
    public Cuenta_Bancaria(String numeroCuenta, String nombreCliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }
    
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public void depositarEnCuenta(double monto) {
        this.saldo += monto;
    }
    
    public void retirarDeCuenta(double monto) {
        if (monto <= saldo) {
            this.saldo -= monto;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public void imprimirDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Saldo: " + saldo);
    }
}