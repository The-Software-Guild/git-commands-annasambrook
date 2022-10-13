/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methods;

/**
 *
 * @author Anna
 */
import java.util.Random;


public class BarelyControlledChaos {
     
     
    public static void main(String[] args) {
            

        String color = chooseColour(); // call color method here
        String animal = chooseAnimal(); // call animal method again here
        String colorAgain = chooseColour(); // call color method again here
        int weight = generateNumber(5, 200); // call number method,
            // with a range between 5 - 200
        int distance = generateNumber(10, 20); // call number method,
            // with a range between 10 - 20
        int number = generateNumber(10000, 20000); // call number method,
            // with a range between 10000 - 20000
        int time = generateNumber(2, 6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    //Method 1
    public static String chooseColour(){
        String[] colours = new String[] {"red", "yellow", "green", "orange", "blue", "white", "black"};
        Random rng = new Random();  
        int randomIndex = rng.nextInt(colours.length);
        return colours[randomIndex];
    }
    // ??? Method 2 ???
    
    public static String chooseAnimal(){
        String[] animals = new String[] {"giraffe", "lion", "monkey", "elephant", "cheetah"};
        Random rng = new Random();  
        int randomIndex = rng.nextInt(animals.length);
        return animals[randomIndex];
    }
    // ??? Method 3 ???
    public static int generateNumber(int min, int max) {
        Random rng = new Random();
        int randomNumber = rng.nextInt(++max - min) + min;
        return randomNumber;
    }
}
