/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_del_teorico;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 *
 * @author Hogar
 */
public class Exc__13_and_14 {
    public static String [ ] membersTeam (String [ ] team, int size){
        Scanner read = new Scanner(System.in);     
                
         for (int i = 0; i < size; i++) {
             System.out.print("Enter the name of a member:  ");
             String name = read.next();
             
             team [ i ] = name;
            
        }        
        return team;        
    }
    
    public static void showArray (String [ ] team, int size){
        String group  = "";
        for (String person : team) {
            group += person + ", ";
            
        }
        
        System.out.println("Hola " + group);
    }
    
    public static void main (String[] args){
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter the number of members:  ");
        int size = read.nextInt();
        
        String[] team = new String[size];
        
        membersTeam(team, size);
        showArray(team, size);
        
    }
}
