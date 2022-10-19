/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anna
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Factorizer {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int number;
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int factorsTotal = 0;
        boolean isPerfect = false;
        boolean isPrime = false;
        
        System.out.println("What number would you like to factor?");
        number = scn.nextInt();
        
        for (int i = 0; i < number; i++){
            if (number % (i +1) == 0){
                factors.add(i + 1);
            }
        }
        
        for (int i = 0; i < factors.size() -1; i++){
            factorsTotal += factors.get(i);
        }
        if (factorsTotal == number){
            isPerfect = true;
        }
        
        if (factors.get(1) == number){
            isPrime = true;
        }
        
        System.out.println("The factors of " + number + " are:");
        System.out.println(factors);
        System.out.println(number + " has " + factors.size() + " factors.");
        System.out.println("This number is perfect: " + isPerfect);
        System.out.println("This number is a prime number: " + isPrime);
        

    }
}
