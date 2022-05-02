/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        /**
         * 2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si
            son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
         */
        
        int valor1 = 50;
        int valor2 = 50;
        
        if(valor1 < valor2 ){
            System.out.println("El Valor " + valor2 + " es mayor al valor " + valor1);
        }else if(valor2 < valor1){
            System.out.println("El Valor " + valor1 + " es mayor al valor " + valor2);
        }else{
            System.out.println("El valor " + valor1 + " es igual al valor " + valor2);
        }
    }
}
