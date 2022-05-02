
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Ejercicicio_13 {
    public static void main(String[] args) {
        /**
         * 13) Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá
            tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrara la suma de
            todas las ventas. Piensa que es lo que se repite y lo que no
         */
        
        //definimos las variables
        int cantidadVentas;
        Scanner scanner = new Scanner(System.in);
        double valorVenta;
        int ventaRealizada = 0; // iniciamos el valor de venta en 0
        
        //mostramos por pantalla el mensaje al usuario
        System.out.println("Ingrese la Cantidad de ventas");
        cantidadVentas = scanner.nextInt();
        
        
        
        for (int j = 1; j <= cantidadVentas; j++) {
            //mostramos el mensaje al usuario y recogemos cada valor de venta
            System.out.print("Ingrese la venta No "+ j + "\n> ");
            valorVenta = scanner.nextDouble(); 
            
            //sumamos las ventas realizada con cada valor de venta registrada
            ventaRealizada += valorVenta; 
            
            //validamos que j se ha igual a la cantidad de ventas para imprimir el total de la venta
            if(j == cantidadVentas){
                //mostramos al usuario el total de las ventas realizadas
                System.out.print("El total de ventas es de \n> " + ventaRealizada + "\n");
            }
        }
        
    }
}
