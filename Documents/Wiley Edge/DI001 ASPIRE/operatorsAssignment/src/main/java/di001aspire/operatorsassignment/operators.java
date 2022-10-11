/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di001aspire.operatorsassignment;

/**
 *
 * @author Anna
 */
public class operators {
    public static void main(String[] args) {
        int result;
        int operand1;
        int operand2;
        int operand3;   
        
        result = 0;
        System.out.println(result);
        
        operand1 = 5;
        operand2 = 7;
        operand3 = operand2;
        
        
        //addition
        
        //literals
        result = 42 + 53;
        System.out.println(result);
        
        //variables
        result = operand1 + operand2;
        System.out.println(result);
        
        //literal + variable
        result = 1 + operand1;
        System.out.println(result);
        
        //chain
        result = 1 + operand1 + operand2 + operand3;
        System.out.println(result);
        
        //+=
        result = 2;
        System.out.println(result);
        
        result += 4;
        System.out.println(result);
        
        result += operand1;
        System.out.println(result);
        
        //subtraction
        //literals
        result = 9 - 5;
        System.out.println(result);
        
        //variables
        result = operand1 - operand2;
        System.out.println(result);
        
        //literal - variable
        result = 15 - operand1;
        System.out.println(result);
        
        //chain
        result = 19 - operand1 - operand2 - operand3;
        System.out.println(result);
        
        //-=
        result = 2;
        System.out.println(result);
        
        result -= 4;
        System.out.println(result);
        
        result -= operand1;
        
        //multiplication
        //literals
        result = 2 * 3;
        System.out.println(result);
        
        //variables
        result = operand1 * operand2;
        System.out.println(result);
        
        //combination
        result = 2 * operand1;
        System.out.println(result);
        
        //chain
        result = 2 * operand1 * operand2 * operand3;
        System.out.println(result);
        
        //*=
        result = 2;
        System.out.println(result);
        
        result *= 4;
        System.out.println(result);
        
        result *= operand1;
        System.out.println(result);
        
        //Division and Modulus
        
        //literals
        result = 6 / 3;
        System.out.println(result);
        
        //variables
        result = operand1 / operand2;
        System.out.println(result);
        
        //modulus gets remainder
        result = operand1 % operand2;
        System.out.println(result);
        
        //combination
        result = 20 / operand1;
        System.out.println(result);
        
        //chain
        result = 245 / operand1 / operand2 /operand3;
        System.out.println(result);
        
        // /=
        result = 40;
        System.out.println(result);
        
        result /= 4;
        System.out.println(result);
        
        result /=operand1;
        System.out.println(result);
                
    }

    


    
    
}
