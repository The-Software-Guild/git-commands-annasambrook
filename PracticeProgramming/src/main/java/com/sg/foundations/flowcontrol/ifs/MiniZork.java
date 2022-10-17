/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;
import java.util.Scanner;
/**
 *
 * @author Anna
 */
public class MiniZork {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                    System.exit(0);
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you are alive. Possibly a wise choice.");
                    System.exit(0);
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("Turns out sticking your hand in places you can't see isn't a good idea.");
                System.out.println("You've been eaten by a grue.");
                System.exit(0);
            }
        } else if (action.equals("go to the house")) {
            System.out.println("You go to the house.");
            System.out.println("You try to open the door but it is locked.");
            System.out.println("Give up and go home or find another way in?");
            action = userInput.nextLine();
            
            if (action.equals("give up and go home")){
                System.out.println("You decided it wasn't worth being eaten by a monster.");
                System.out.println("You went home and had a nice cup of tea.");
                System.out.println("Boring... but at least you're alive.");
                System.exit(0);
                
            } else if (action.equals("find another way in")){
                System.out.println("You found a window that you can squeeze through.");
                System.out.println("When you get inside you see 2 staircases.");
                System.out.println("One leads up to the attic, and one down to the cellar.");
                System.out.println("Up or down?");
                action = userInput.nextLine();
                
                if (action.equals("up")){
                    System.out.println("The attic is full of junk. There isn't much of worth here.");
                    System.out.println("What a boring end to an exciting quest.");
                    System.exit(0);
                    
                } else if (action.equals("down")) {
                    System.out.println("You creep down into the cellar. It's dark and you can hardly see.");
                    System.out.println("As you descend a glimmer of light catches your eye.");
                    System.out.println("You edge nearer to find out what it is...");
                    System.out.println("What a stroke of luck, you found the treasure.");
                    System.out.println("You go home happy and rich.");
                    System.exit(0);
                }
            }
        }
    }
}
