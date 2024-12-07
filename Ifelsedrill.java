/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelsedrill;

/**
 *
 * @author janxyz
 */
import java.util.Scanner;

public class Ifelsedrill {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Exam Score: ");
        
        int score = sc.nextInt();
        
        if(score <=59){
            System.out.println("Your Grade is F");
        }else if(score >=60 && score <=69){
            System.out.println("Your Grade is D");
        }else if(score >=70 && score <=79){
            System.out.println("Your Grade is C");
        }else if(score >=80 && score <=89){
            System.out.println("Your Grade is B");
        }else if(score >=90 && score <=100){
            System.out.println("Your Grade is A");
        }
    }
}
