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
public class Empleado {
    private String nombre;
    private String apellido;
    private String direccion;
    private int anioIngreso;
    private double salario;

    public Empleado() {
        this.nombre = "joe";
        this.apellido = "mama";
        this.direccion = "xbox, yucatan";
        this.anioIngreso = 1968;
        this.salario = 419;
    }

    public Empleado(String nombre, String apellido, String direccion, int anioIngreso, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.anioIngreso = anioIngreso;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int calcularVacaciones() {
        int antiguedad = 2023 - anioIngreso;
        int diasVacaciones = 6 + (antiguedad - 1) * 2;
        if (antiguedad >= 5 && antiguedad % 5 == 0) {
            diasVacaciones += 2;
        }
        return diasVacaciones;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Dirección: " + direccion);
        System.out.println("Año de ingreso: " + anioIngreso);
        System.out.println("Salario: " + salario);
        System.out.println("Días de vacaciones: " + calcularVacaciones());
    }
}
