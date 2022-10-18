/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Anna
 */
public class GuessMeMore {
    public static void main(String[] args) {
        int myNumber;
        String stringUserNumber;
        int userNumber;
        
        Scanner myScanner = new Scanner(System.in);
        Random rng = new Random();
        
        myNumber = rng.nextInt(201) -100;
        
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
