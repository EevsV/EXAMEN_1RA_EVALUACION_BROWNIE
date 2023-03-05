package clases_examen;

/**
 *
 * @author mario
 */
public class DatosIntegrantes {
    
    private String names;
    private String lastnames;
    private int Ncontrol;
    
    public String getNames(){
        return names;
    }
    public void setNames(String valor){
        names = valor;
    }
     public String getLastnames(){
        return lastnames;
    }
    public void setLastnames(String valor){
        lastnames = valor;
    }
    public int getNcontrol(){
        return Ncontrol;
    }
    public void setNcontrol(int valor){
        Ncontrol = valor;
    }
    
    public void imprimirDatosEquipo(){
        System.out.println("Nombre: " +names);
        System.out.println("Apellidos: " +lastnames);
        System.out.println("Numero de Control: " +Ncontrol);
    }
            
                  
}

