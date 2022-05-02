
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Ejercicio_5 {
    public static void main(String[] args) {
        /**
         * Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
(          recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow
           de Math.
         */
        
        //definimos las variables
        String valor;
        double radio, resultado;
        Scanner scanner = new Scanner(System.in);
        
        //imprimimos el mensaje al usuario
        System.out.print("Ingrese el radio del circulo\n>");
        
        // escaneamos el numero ingresado
        valor = scanner.nextLine();
        
        //pasamos de string a double
        radio = Double.parseDouble(valor);
        
        //realizamos la operacion para hallar el area del circulo
        resultado = Math.PI * Math.pow(radio,2);
           
       //mostramos el resultado al usuario
        System.out.println("El area del circulo es:\n> (3.1415 * " + radio*2 +") =  "+resultado);
    }
}
