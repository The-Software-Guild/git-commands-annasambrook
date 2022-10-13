
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuessMe;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class GuessMe {
    public static void main(String[] args) {
        int myNumber = 88;
        String stringUserNumber;
        int userNumber;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Ive chosen a number. Betcha can't guess it!");
        System.out.println("Pick a whole number");
        stringUserNumber = myScanner.nextLine();
        
        
        userNumber = Integer.parseInt(stringUserNumber);
        System.out.println("Your number: " + stringUserNumber);
       
        if (userNumber == myNumber){
            System.out.println("Wow, nice guess! That was it!");
        } else if (userNumber < myNumber) {
            System.out.println("Ha, nice try - too low! I chose " + myNumber + ".");
        } else if (userNumber > myNumber) {
            System.out.println("Too bad, way too high. I chose " + myNumber + ".");
        }
    }
}
