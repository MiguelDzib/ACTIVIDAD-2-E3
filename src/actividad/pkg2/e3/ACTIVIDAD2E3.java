/*
3.- Crear un metodo que lea un valor entero del 1 al 12 valide el valor y  nos
diga en que trimestre del año nos encontramos (Primer trimestre, Segundo 
Trimestre, Tercer Trimeste, Cuarto Trimestre)
 */
package actividad.pkg2.e3;
import java.util.Scanner;
public class ACTIVIDAD2E3 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa el numero del mes:");
        int mes=entrada.nextInt();
        switch (mes){
            case 1,2,3:
                System.out.println("PRIMER TRIMESTRE");
                break;
            case 4,5,6:
                 System.out.println("SEGUNDO TRIMESTRE");
                break;
            case 7,8,9:
                 System.out.println("TERCER TRIMESTRE");
                break;
            case 10,11,12:
                 System.out.println("CUARTO TRIMESTRE");
                break;
            default:
                 System.out.println("Numero incorrecto");
                    
        }
        
        
    }
    
}
