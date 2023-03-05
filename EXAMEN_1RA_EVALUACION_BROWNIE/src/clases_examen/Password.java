/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;

/**
 *
 * @author mario
 */
public class Password {
    private String Usuer;
    private String Password;
    
    public Password(){
        Usuer = "Usuario";
        Password = "Contrañesa";
    }
    public Password(String valor1, String valor2){
        Usuer = valor1;
        Password = valor2;
    }
    public void setUsuer(String valor1){
        Usuer = valor1;
    }
    public void setPassword(String valor2){
        Password = valor2;
    }
    public boolean VerificarAcceso(){
        if(Usuer=="JOE"){
            if(Password=="MOMA"){
                return true;
            }
        }
        return false;
    }
}