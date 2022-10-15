package di001aspire.basicprogrammingconceptsassessment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anna
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; 
import java.util.Random;

public class DogGenetics {

    public static void main(String[] args){
        //initialise scanner
        Scanner scn = new Scanner(System.in);
       
        //initialise random
        Random rng = new Random();

        //declare variables
        String dogName;
        ArrayList<String> dogBreeds;
        String[] dogGenes;
        String[] dogBreedsList;
        int genePercent1;
        int genePercent2;
        int genePercent3;
        int genePercent4;
        int genePercent5;

        //introduce game
        System.out.println("Ever wondered about your dog's genetics? I've got the perfect and 100% accurate calculator for you!");
       
        //prompt user input for dog name
        System.out.println("What is your dog's name?");
        dogName = scn.nextLine();
        
        //create ArrayList for dog breeds
        dogBreedsList = new String[] {"Bulldog", "Golden Retriver", "Beagle", "Pug", "Newfoundland", "Spaniel", "Boarder Collie", "Labrador", "Poodle", "Huskie"};
        dogBreeds = new ArrayList<String>();
        for (int i = 0; i < dogBreedsList.length; i++){
           dogBreeds.add(dogBreedsList[i]);
       }
       
        //System.out.println(dogBreeds);
        
        //create array of random genetics
        dogGenes = new String[5];
        for (int i = 0; i < 5; i++) {
            int randomIndex = rng.nextInt(dogBreeds.size());
            dogGenes[i] = dogBreeds.get(randomIndex);
            dogBreeds.remove(randomIndex);
        }
        
        //System.out.println(Arrays.toString(dogGenes));
        //Assign random percentages to breeds
        
        genePercent1 = rng.nextInt(100);
        genePercent2 = rng.nextInt(100 - genePercent1);
        genePercent3 = rng.nextInt(100 - genePercent1 - genePercent2);
        genePercent4 = rng.nextInt(100 - genePercent1 - genePercent2 - genePercent3);
        genePercent5 = (100 - genePercent1 - genePercent2 - genePercent3 - genePercent4);
        
        System.out.println(" ");
        System.out.println(dogName + " is:");
        System.out.println(genePercent1 + "% " + dogGenes[0]);
        System.out.println(genePercent2 + "% " + dogGenes[1]);
        System.out.println(genePercent3 + "% " + dogGenes[2]);
        System.out.println(genePercent4 + "% " + dogGenes[3]);
        System.out.println(genePercent5 + "% " + dogGenes[4]);
   } 
}
