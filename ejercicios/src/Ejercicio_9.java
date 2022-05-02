
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Ejercicio_9 {
    public static void main(String[] args) {
        /**
         * 9) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule
            el precio final con IVA. El IVA sera una constante que sera del 21%
         */
        
        //definimos las variables
        double precio;
        final double IVA = 0.21;
        double resultado;
        Scanner scanner = new Scanner(System.in);
        
        //solicitamos al usuairo el precio de cualquier producto
        System.out.print("Ingrese el precio de cualquier producto\n> ");
        precio = scanner.nextDouble();
        
        //realizamos la operacion (precio* iva)
        resultado = precio * IVA;
        //mostramos al usuario el iva y el valor con el iva
        System.out.println("el iva del producto es de " + resultado);
        System.out.println("total a pagar sera de un "+ ( precio += resultado));
        
    }
}
