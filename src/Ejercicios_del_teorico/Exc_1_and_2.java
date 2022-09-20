/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_del_teorico;

/**
 *
 * @author Hogar
 */

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Exc_1_and_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre: ");
        String nombre = leer.next();
        
        System.out.println("Ingresa tu DNI (sin puntos): ");
        int dni = leer.nextInt();
        
        System.out.println("Ingresa un numero con coma: ");
        float numconcoma = leer.nextFloat();
        
        System.out.println("¿Sos humano?  ");
        String respuesta = leer.next();
        boolean bandera;
       
        int numero = 48;
        double decimales = 3.55;
        boolean banderas = false;
        
        char letra;

        
        System.out.println("Hello World! I´m " + nombre + " and I am programming in Java =D");
        System.out.println("My D.N.I. is:  " + dni);
        
        }
}
