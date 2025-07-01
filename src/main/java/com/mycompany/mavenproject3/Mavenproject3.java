/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;
package com.mycompany.mavenproject3;

/**
 *
 * @author Student
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        
        
    Scanner input = new Scanner(System.in);
    int number1, number2 ;
    System.out.println("Enter 2 numbers");
    number1 = input.nextInt();
    number2 = input.nextInt();
    
    if (number1== number2)
        System.out.println("equals");
    else if (number1>number2)
        System.out.println("Number1 is Greater");
    else 
        System.out.println("Number2 is Greater");
    
    
        
        
        
    }
    
}
