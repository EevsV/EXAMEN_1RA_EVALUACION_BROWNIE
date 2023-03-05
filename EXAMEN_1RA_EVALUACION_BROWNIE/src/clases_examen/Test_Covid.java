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
public class Test_Covid {
    
    private int edad;
    private boolean enfermedad;
    private int peso;
    private int estatura;
    
    public Test_Covid(){
        edad=18;
        enfermedad=false;
        peso=68;
        estatura=28;
        
    }
    // metodo set
   public void setEdad(int x){
   edad = x;
}
   public void setEnfermedad(boolean x){
    enfermedad = x;
}
   public void setPeso(int x){
    peso = x;
}
   public void setEstatura(int x){
       estatura = x;
  
}
    // metodo get 
  public int getEdad(){
      return edad;
  }
  public boolean getEnfermedad(){
      return enfermedad;
  }
  public int getPeso(){
      return peso;
  }
  public int getEstatura(){
      return estatura;
  }
  //metodo calcular imc
 public String calcularPersonaRiesgo() {
        double imc = calcularIMC();
        if (edad >= 65 || enfermedad || imc > 30) {
            return "PERSONA DE RIESGO";
        } else {
            return "PERSONA SIN RIESGO";
        }
    }
    
    private double calcularIMC() {
        double imc = peso / (estatura * estatura);
        return imc;
    }
}