/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author Anna
 */

import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int fizzBuzz = 0;
        int userFizzBuzz;
        
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        userFizzBuzz = scn.nextInt();
        
        for (int i = 1; fizzBuzz < userFizzBuzz; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("fizz buzz");
                fizzBuzz++;
            } else if (i % 3 == 0){
                System.out.println("fizz");
                fizzBuzz++;
            } else if (i % 5 == 0){
                System.out.println("buzz");
                fizzBuzz++;
            } else {
                System.out.println(i);
            }
        }
        System.out.println("TRADITION!!!");
    }
}
