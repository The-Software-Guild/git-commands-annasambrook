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

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double annualInterestRate;
        double initialPrinciple;
        int yearsInFund;
        int yearNumber;
        double currentPrinciple;
        
        //Get initial principle
        System.out.println("How much do you want to invest?");
        initialPrinciple = scn.nextDouble();
        
        //get years in fund
        System.out.println("For how many years are you investing?");
        yearsInFund = scn.nextInt();
        
        System.out.println("What is the annual interest rate % growth?");
        annualInterestRate = scn.nextDouble();
        
        System.out.println("Calculating...");
        
        //set current principle
        currentPrinciple = initialPrinciple;
        
        for (int i = 0; i < yearsInFund; i++){
            double amountEarned = 0;
            double yearTotal= 0;
            System.out.println("Year " + (i + 1) + ":");
            System.out.println("Began with £" + currentPrinciple);
            
            amountEarned = Math.round((currentPrinciple * (annualInterestRate / 100) * 100)) / 100;
            
            
            System.out.println("Earned £" + amountEarned);
            yearTotal = currentPrinciple + amountEarned;
            System.out.println("Ended with £" + yearTotal);
            currentPrinciple = yearTotal;
        }
    }
}
