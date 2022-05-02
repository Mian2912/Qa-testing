/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Ejercicio_12 {
    public static void main(String[] args) {
        /**
         * 12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que
            desees
         */
        
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.println("El " + i + " es divisible por 2");
            }else if(i % 3 == 0){
                System.out.println("El " + i + " es divisible por 3");
            }
        }
    }
}
