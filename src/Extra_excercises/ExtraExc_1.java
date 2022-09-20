
package Extra_excercises;

import java.util.Scanner;


public class ExtraExc_1 {
    public static int [] minutesTransformation(int minuts){
        int hours = Math.round((minuts / 60) - 24);
        int days = Math.round(minuts / 1440);
        
        int array [] = new int[2];
        array[0] = days;
        array[1] = hours;
        
        return array;
        
    }
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the amout of minutes:  ");
        int minutes = input.nextInt();
        
        int [] result = minutesTransformation(minutes);
        
        System.out.println("The equivalent is: " + result[0] + " days" + " and " + result[1] + " hours.");
        
    }
    
}
