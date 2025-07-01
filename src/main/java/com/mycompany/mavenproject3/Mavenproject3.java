/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.mavenproject3;

import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        
        
    Scanner input = new Scanner(System.in);
    int marks;
    
    System.out.println("Enter your mark");
    marks = input.nextInt();
   
    
    if (marks >=90)
        System.out.println("you got A");
    else if (marks >=80)
        System.out.println("You got B");
    else if (marks >=70)
        System.out.println("You got C");
    else if (marks >=60)
        System.out.println("You got D");
    else
        System.out.println("You got F");
    
    
        
        
        
    }
    
}
