
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Ejercicio_7 {
    public static void main(String[] args) {
        /**
         * 7) Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
            Por ejemplo: si introduzco un 97, me muestre una a.
         */
        
        //definimos la variables
        int valor;
        char cambioLetra;
        Scanner scanner = new Scanner(System.in);
        
        //mostramos el mensaje al usuario indicando que ingrese un numero
        System.out.print("Ingrese un numero para convertir a letra\n>");
        valor = scanner.nextInt();
        
        //realizamos la conversion de numero a letra
        cambioLetra = (char)valor;
        
        //mostramos el resultado al usuario
        System.out.println("El numero Ingresado " + valor + " es el caracter de la tabla ascii\n>" + cambioLetra);
                
                
    }
}
