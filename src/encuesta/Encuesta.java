package encuesta;
/**
 *
 * @author Estudiante
 */
import java.util.Scanner;
public class Encuesta {

    public static void main(String[] args) {
        
        // Hola
        /*
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
            }
        */   
          
        //Buenas Felipe.
        //Como te va?
        //Todo bien, sufriendo con Calculo Integral
        //COn Chadid se sufre un poco siempre :)
        //QUe tal algebra lineal?  A mi me encanta
        //Ando chateando desde visual studio.
        
        // Funcion en la que de un x y me devuelva su funcion.
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese los valores de una función ax^2 + bx + c: ");
        
        System.out.println("Ingrese el valor de a: ");
        int a = lector.nextInt();
        
        System.out.println("Ingrese el valor de b: ");
        int b = lector.nextInt();
        
        System.out.println("Ingrese el valor de c: ");
        int c = lector.nextInt();
        
        System.out.println("Su función es f(x): " + a + "x^2 + " + b + "x + " + c);
        
    }
    
    
}
    

