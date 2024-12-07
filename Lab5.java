import java.util.Scanner;

public class Lab5 {

    public static void main(String[] args) {
        
        //made a multiple variables
        int burger = 100, fries = 50, soda = 30, icecream = 45, total = 0;
        
        //implements 
        Scanner sc = new Scanner (System.in);
        //displays the Menu
        System.out.println("1. Burger \t - PHP 100"); 
        System.out.println("2. Fries \t - PHP 50");
        System.out.println("3. Soda \t - PHP 30");
        System.out.println("4. Ice Cream\t - PHP 45");
        System.out.println("5. EXIT");
        
        System.out.print("Enter the menu number of your choice: ");
        //asks the user number of choice given in the menu
        int menuNumber =sc.nextInt();
        
        System.out.print("Quantity: ");
        //asks the user how many quantity
        int qty = sc.nextInt();
        
        switch (menuNumber){
            case 1:
                System.out.println("You ordered Burger.");
                //made a variable total to get the price of burger
                total = burger; 
                break;
            
            case 2:
                System.out.println("You ordered Fries.");
                //made a variable total to get the price of fries
                total = fries; 
                break;
            
            case 3:
                System.out.println("You ordered Soda.");
                
                total = soda;
                break;
            
            case 4:
                System.out.println("You ordered Ice Ceam.");
                //made a variable total to get the price of ice cream
                total = icecream;
                break;
                
            default:
                System.out.println("EXIT");
            }
        
        //calculates the total 
        int totalAmount = total*qty; 
        //gets the total amount
        System.out.println("Total amount: "+totalAmount); 
    }
}
