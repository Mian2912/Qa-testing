
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Ejercicio_8 {
    public static void main(String[] args) {
        /**
         * Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y
            muestre su código en la tabla ASCII.
         */
        
        //definimos las variables
        String letra;
        int valor;
        Scanner scanner = new Scanner(System.in);
                
        //mostramos al usuario el mensaje de ingresar un caracter
        System.out.println("Ingrese un caracter ");
        letra = scanner.nextLine();
        
        //validamos si el usaurio ingreso mas de dos caracteres
        while (letra.length() > 1){
           System.out.println("dato Incorrecto, Ingrese un caracter ");
           letra = scanner.nextLine();
        }
        
        // pasamos de un string a char
        valor = letra.charAt(0); 
        
        //mostramos por pantalla el resultado al usuario
        System.out.println("El caracter ingresado " + letra + " es el numero "+ valor + " en la tabla ascii");
     }
}
