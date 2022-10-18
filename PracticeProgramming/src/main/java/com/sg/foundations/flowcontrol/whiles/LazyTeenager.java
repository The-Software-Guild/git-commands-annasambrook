/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author Anna
 */

import java.util.Random;

public class LazyTeenager {
    

    
    public static void main(String[] args){
    boolean roomCleaned = false;  
    int percentChanceOfRoomClean = 0;
    int numRoomCleaned;
    Random rng = new Random();
    int counter = 0;
    
        do {   
            System.out.println("P: Clean your room!"); 
            percentChanceOfRoomClean += 10;
            numRoomCleaned = rng.nextInt(101);
            if (numRoomCleaned <= percentChanceOfRoomClean){
                roomCleaned = true;
                System.out.println("T: FINE I'LL CLEAN MY ROOM!");
            } else {
                System.out.println("T: You can't make me clean my room.");
            }
            counter++;
                
        } while ((roomCleaned == false) && (counter < 7));   
        
        if (roomCleaned == false){
            System.out.println("That's it you're grounded. Go to your room and clean it!");
        }
    }
}
