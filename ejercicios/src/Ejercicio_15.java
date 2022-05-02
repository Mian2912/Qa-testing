
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Ejercicio_15 {
    public static void main(String[] args) {
        /**
         * 15) Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo
            es lo volverá a pedir (do while), después muestra ese número por consola.
         */
        
        //declaramos las variables
        int numero;
        Scanner scanner = new Scanner(System.in);
        
        //validamos si el numero es mayor a 0
        do {      
            System.out.print("Ingrese un numero \n> ");
            numero = scanner.nextInt(); 
        } while (numero <= 0);
        System.out.println("numero ingresado es: \n> " + numero);
    }
}
