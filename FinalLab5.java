//COLLADO JOHN FRANK
//CITCS 1N GROUP A
import java.util.*;
import javax.swing.JOptionPane;

public class FinalLab5 {

    public static void main(String[] args) {
        
        //greets the user
        JOptionPane.showMessageDialog(null, "WELCOME TO BANCO DE ORO!", "Greetings",
                      JOptionPane.INFORMATION_MESSAGE);
        
        //Options what the user wants to do
        String [] options = { "Withdraw", "Deposit", "Cancel" };
        //pre-defined variable to make a existing balance
        int userBal = 100;
        
        //asks the user what the user wants to do
        int choice = JOptionPane.showOptionDialog(null, "Choose an option", "FRANK",JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
        
        //if the user choose withdraw, which is 0 in index of the array in options
        if(choice == 0){
            //asks the user how much is he want to withdraw
            String withdrawAmount = JOptionPane.showInputDialog(null, "Please enter the withdraw amount", "Amount", 
                                    JOptionPane.QUESTION_MESSAGE);
            
            try{
                //converts the string variable withdraw to int withdraw
                int withdraw = Integer.parseInt(withdrawAmount);
                //if withdraw value is greater than balance
                if(withdraw > userBal){
                    //it would say insufficient balance because you can't withdraw greater than the userBal
                    JOptionPane.showMessageDialog(null, "Insufficient balance. Your Balance is: "+userBal,
                                                  "Error",JOptionPane.ERROR_MESSAGE);
                }else {
                    //created formula for the current balance, if the user withdraw it would subtract the user balance depends on how much amount withdrawn
                    withdraw = userBal-withdraw;
                    JOptionPane.showMessageDialog(null, "You have successfully withdrawn: "
                                                 + userBal + "\nYour new balance is: " + withdraw, "Transaction Successful", 
                                                 JOptionPane.INFORMATION_MESSAGE);
                }
            //made a catch if because if the user input a letter or a word it will not exit the code immediately
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number for withdrawal.",
                                             "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else if (choice == 1){
            String depositAmount = JOptionPane.showInputDialog(null, "Please enter the deposit amount", "Amount", 
                                                               JOptionPane.QUESTION_MESSAGE);
            try{
                int deposit = Integer.parseInt(depositAmount);
                    int newBal = userBal+deposit;
                    JOptionPane.showMessageDialog(null, "You have successfully deposit: " + userBal +
                                "\nYour new balance is: " + newBal, "Transaction Successful", JOptionPane.INFORMATION_MESSAGE);
            //made a catch if because if the user input a letter or a word it will not exit the code immediately        
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number for withdrawal.",
                                                "Error", JOptionPane.ERROR_MESSAGE);
            }
        //if the user choose cancel the operation
        }else{
            JOptionPane.showMessageDialog(null, "You canceled the operation", "Cancel Operation", JOptionPane.ERROR_MESSAGE);
        }
    }
}
