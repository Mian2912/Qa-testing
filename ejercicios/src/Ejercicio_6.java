
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Ejercicio_6 {
    public static void main(String[] args) {
        /**
         * 6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también
            debemos indicarlo.
         */
        
        //declaramos la variables 
        int numero;
        Scanner scanner = new Scanner(System.in);
        
        //mostramos por pantalla el mensaje al usuairo
        System.out.print("Ingrese Un numero\n>");
        numero = scanner.nextInt();
        
        if (numero % 2 == 0){
            System.out.println(">El Numero Ingrsado Ds Divisible Por 2");
        }else{
            System.out.println(">El Numero Ingresado No Es Divisible Por 2");
        }
        
    }
}
