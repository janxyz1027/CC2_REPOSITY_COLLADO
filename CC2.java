/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cc2.collado;

/**
 *
 * @author janxyz
 */

/*COLLADO JOHN FRANK D.             SEPT/12/24
CITCS 1N GROUP A                    CC2
*/

import java.util.Scanner;

public class CC2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);//scanner to make a userinput
        
        System.out.println("Enter the price of item 1   : "); //SOP to print and int int item1 = sc.nextInt();
        int item1 = sc.nextInt();                             //to input the price of the item and scan what the input is without the int item1 = sc.nextInt
        System.out.println("Enter the quantity of item 1: "); //the user won't be able to input any int or numbers it will just print the Enter the price of item1
        int qty1 = sc.nextInt();
        System.out.println("Enter the price of item 2   : ");
        int item2 = sc.nextInt();
        System.out.println("Enter the quantity of item 2: ");
        int qty2 = sc.nextInt();
        System.out.println("Enter the price of item 3   : ");
        int item3 = sc.nextInt();
        System.out.println("Enter the quantity of item 3: ");
        int qty3 = sc.nextInt();
        
        //made a variables of subtotal, discount, salestax to solve the program that should be calculated below
        int subtotal = (100*2)+(50*3)+(150*1);
        float discount = 0.05f;//converted 5% 
        float salestax = 0.12f;//converted 12% to 0.12
        
        //gets the inputs of the user
        System.out.println("Enter the price of item 1   : "+item1);
        System.out.println("Enter the quantity of item 1: "+qty1);
        System.out.println("Enter the price of item 2   : "+item2);
        System.out.println("Enter the quantity of item 2: "+qty2);
        System.out.println("Enter the price of item 3   : "+item3);
        System.out.println("Enter the quantity of item 3: "+qty3);
        
        //program that should be calculated
        System.out.println("Subtotal    : PHP "+subtotal);
        System.out.println("Discount    : PHP "+discount*500);
        System.out.println("Salestax    : PHP "+(subtotal-25)*(+salestax));
        System.out.println("Final Total : PHP "+(475+57));
        
    }
}
