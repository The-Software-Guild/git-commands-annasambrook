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

public class YourLifeInMovies {
    public static void main(String[] args){
        int yearBorn;
        String stringYearBorn;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("In what year were you born?");
        stringYearBorn = myScanner.nextLine();
        yearBorn = Integer.parseInt(stringYearBorn);
        
        if (yearBorn < 2005) {
            System.out.println("Did you know that Pixar's 'Up' came out over a decade ago?");
        } if (yearBorn < 1995) {
            System.out.println("Also, the first 'Harry Potter' film was released over 15 years ago!");
        } if (yearBorn < 1985) {
            System.out.println("AND 'Space Jam' first took to the scene not last decade but the one before that.");
        } if (yearBorn < 1975){
            System.out.println("And the original 'Jurassic Park' release is closer to the first lunar landing that it is to today.");
        } if (yearBorn < 1965){
            System.out.println("As a reminder, the 'MASH' TV series has been around for almost half a century.");
        }
        
        System.out.println("Feel old yet?");
    }
}
