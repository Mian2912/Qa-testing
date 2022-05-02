
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Ejercicio_4 {
    public static void main(String[] args) {
        /**
         * 4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda
            usar JOptionPane)
         */
        
        String nombre;
        nombre = JOptionPane.showInputDialog(null,"Introdusca su Nombre");
        System.out.println("Bienvenido " + nombre);
    }
}
