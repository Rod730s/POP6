/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 * Clase principal que prueba la clase Coche.
 * 
 * @author Rodrigo Ceron
 */
public class POOP6 {
    
    /**
     * Método principal que ejecuta el programa.
     * 
     * @param args Los argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main (String[] args) {
        // Crear un objeto Coche utilizando el constructor por defecto
        Coche coche = new Coche();
        
        // Crear un objeto Coche con atributos específicos
        Coche coche2 = new Coche("azul", "Porsche", "MXN-669");
        
        // Imprimir los objetos coche
        System.out.println(coche);
        System.out.println(coche2);
    }
}

