package encuesta;
/**
 *
 * @author Estudiante
 */
import java.util.Scanner;
public class Encuesta {

    public static void main(String[] args) {
        
        // Hola
        
        //Realizar una encuesta y convertir los datos
        Scanner ConsoleInput = new Scanner(System.in);
        System.out.println("Bienvenid@. Por favor, diligencie la siguiente encuesta:");
        System.out.println("Ingrese su nombre:");
        String Nombre = ConsoleInput.nextLine();
        System.out.println("Ingrese su edad");
        String Edad = ConsoleInput.nextLine();
        System.out.println("Su nombre es: "+Nombre+" Y su edad es:"+Edad);
        int lenghtNombre = Nombre.length();
        char[] charNombre = Nombre.toCharArray();
        Character j;
        for (int i = 0;i<lenghtNombre; i = i+1){
            j = charNombre[i];
            System.out.println("El codigo ASCII del caracter "+charNombre[i]+ 
                    " es: " +j.hashCode());  
            
        //Buenas Felipe.
        //Como te va?
        //Todo bien, sufriendo con Calculo Integral
    }
    }
    
}
