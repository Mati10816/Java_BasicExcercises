
package Practical_exercises;

import java.util.Scanner;
import javafx.beans.binding.Bindings;

public class Exc__12 { 
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String sentence;
        int quantityOk = 0;
        int quantityNo = 0;
        
        System.out.println("The sentence (must have 5 characters, begin whit 'X' and end whit 'O'):  ");
        System.out.println("Finish the program by entering '&&&&&'\n");
        
        
        do {     
            System.out.print("Enter a sentence:  ");
            sentence = read.nextLine();
            
            if (("X".equals(sentence.substring(0, 1)))  && ("O".equals(sentence.substring(4, 5))) && (sentence.length() == 5)){
                quantityOk += 1;
            }else if (! "&&&&&".equalsIgnoreCase(sentence)){
                quantityNo += 1;
            }
            
            
        } while (! sentence.equalsIgnoreCase("&&&&&") );
        
        System.out.println("\nThe quantity of correct sentences is: " + quantityOk);
        System.out.println("The quantity of INconrrect sentences is: " + quantityNo);
    }
    
    
}
