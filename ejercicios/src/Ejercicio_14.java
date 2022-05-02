
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Ejercicio_14 {
    public static void main(String[] args) {
        /**
         * 14) Realiza una aplicación que nos calcule una ecuación de segundo grado. Debes pedir las
           variables a, b y c por teclado y comprobar antes que el discriminante (operación en la raíz
           cuadrada). Para la raíz cuadrada usa el método sqlrt de Math. Te recomiendo que uses mensajes
           de traza.
         */
        
        //definimos las variables 
        double a ,b ,c, resultado;
        Scanner scanner = new Scanner(System.in);
        
        // solicitamos al usuario los valores de a, b y c
        System.out.print("Introdusca el valor de a \n> ");
        a = scanner.nextInt();
        
        System.out.print("Introdusca el valor de b \n> ");
        b = scanner.nextInt();
        
        System.out.print("Introdusca el valor de c \n> ");
        c = scanner.nextInt();
    
        a = Math.pow(a, 2);
        resultado = a - b + c;
        System.out.println("la raiz cudrda de " + resultado + " es:\n> " + Math.sqrt(resultado));
        
                
    }
}
