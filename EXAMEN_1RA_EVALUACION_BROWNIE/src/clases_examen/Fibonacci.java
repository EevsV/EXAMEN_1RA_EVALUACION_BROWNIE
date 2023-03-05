/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_examen;

/**
 *
 * @author eevsg
 */
public class Fibonacci {
    private int n;
    private int a1;
    private int a2;
    
    public Fibonacci(){
        n = 6;
        a1 = 1;
        a2 = 2;
    }
    
    public Fibonacci(int num, int x, int y){
        n = num;
        a1 = x;
        a2 = y;
    }
    
    public void setN(int valor){
        n = valor;
    }
    public void setA1(int valor){
        a1 = valor;
    }
    public void setA2(int valor){
        a2 = valor;
    }
    
    public int getN(){
        return n;
    }
    public int getA1(){
        return a1;
    }
    public int getA2(){
        return a2;
    }
    
    public void printFibonacci(){
       int resu = 0;
       System.out.print(a1 + " - " + a2 + " - ");
       for(int i = 2; i < (n); i++){
           resu = a1+a2;
           System.out.print(resu + " - ");
           a1 = a2;
           a2 = resu;
       }
    }
}
