/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di001aspire.basicprogrammingconceptsassessment;

/**
 *
 * @author Anna
 */
import java.util.Scanner; 

public class HealthyHearts {
    public static void main(String[] args){
        
        //initialise variables
        int age;
        int maxHR;
        int targetMin;
        int targetMax;
        
        //initialise scanner
        Scanner scn = new Scanner(System.in);
        
        System.out.println("What is your age?");
        age = scn.nextInt();
        
        maxHR = 220 - age;
        targetMin = (int) (maxHR * 0.5);
        targetMax = (int) (maxHR * 0.85);
        
        System.out.println("Your target HR Zone is " + targetMin + " - " + targetMax + " bpm.");
    }
}
