

package examen_1ra_evaluacion_brownie;

import clases_examen.Cuenta_Bancaria;
import clases_examen.DatosIntegrantes;
import clases_examen.Empleado;
import clases_examen.Password;
import clases_examen.Fibonacci;
import clases_examen.Peliculas;
import clases_examen.Test_Covid;

/**
 *
 * @author mario
 */
public class EXAMEN_1RA_EVALUACION_BROWNIE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Datos Integrantes:");

        DatosIntegrantes integrante1 = new DatosIntegrantes();
        
        System.out.println("Integrante 1");
        integrante1.setNames("Fabián Armando");
        integrante1.setLastnames("Bustillos Vitela");
        integrante1.setNcontrol(22550344);
        integrante1.imprimirDatosEquipo();
        
        System.out.println("");
        
        DatosIntegrantes integrante2 = new DatosIntegrantes();
        
        System.out.println("Integrante 2");
        integrante2.setNames("Sebastián");
        integrante2.setLastnames("Gardea Saucedo");
        integrante2.setNcontrol(22550363);
         integrante2.imprimirDatosEquipo();
        
        System.out.println("");
        
        DatosIntegrantes integrante3 = new DatosIntegrantes();
        
        System.out.println("Integrante 3");
        integrante3.setNames("Isaac Manuel");
        integrante3.setLastnames(" Guzmán González");
        integrante3.setNcontrol(22550331);
         integrante3.imprimirDatosEquipo();
        
        System.out.println("");
        
        DatosIntegrantes integrante4 = new DatosIntegrantes();
        
        System.out.println("Integrante 4");
        integrante4.setNames("Omar Alfonso");
        integrante4.setLastnames(" Palomino Romero");
        integrante4.setNcontrol(22550333);
         integrante4.imprimirDatosEquipo();
        
        System.out.println("");
        
        DatosIntegrantes integrante5 = new DatosIntegrantes();
        
        System.out.println("Integrante 5");
        integrante5.setNames("Mario");
        integrante5.setLastnames("Sylva Iracheta");
        integrante5.setNcontrol(22550369);
         integrante5.imprimirDatosEquipo();
         
         System.out.println("");
         System.out.println("- Contraseña -");
         
         main2();
         
         System.out.println("");
         System.out.println("- Fibonacci -");
         Fibonacci fib1 = new Fibonacci(6,2,5);
         fib1.printFibonacci();
         
         System.out.println("");
         System.out.println("- Cuenta Bancaria -");
         
         Cuenta_Bancaria cb1 = new Cuenta_Bancaria("54321,","Sebastian", 25.00);
         cb1.imprimirDatos();
         cb1.depositarEnCuenta(50.00);
         cb1.imprimirDatos();
         
         System.out.println("");
         System.out.println("- Empleado -");
         
         Empleado em1 = new Empleado();
         em1.imprimirDatos();
         em1.calcularVacaciones();
         
         System.out.println("");
         System.out.println(" -Test Covid -");
         Test_Covid tc1 = new Test_Covid();
         tc1.calcularPersonaRiesgo();
         
         System.out.println("");
         System.out.println("- Peliculas -");
         Peliculas p1 = new Peliculas("Deez","Nuts",18);
         p1.imprimirDatos();
         p1.evaluarEdad(17);
         
         
    }
    
    public static void main2(){
        
        Password UP = new Password();
        System.out.println(UP.VerificarAcceso());
        
        Password UP2 = new Password("JOE", "MOMA");
        System.out.println(UP2.VerificarAcceso());
        
        
    }
    
}
    

