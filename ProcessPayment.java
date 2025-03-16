package com.mycompany.paymentprocessor;
import javax.swing.JOptionPane;

//Abstract class
abstract class Payment{
    protected double amount;
    
    //Constructor 
    public Payment(double amount) {
        this.amount = amount;
    }
    //Method
    public abstract void processPayment();
}

//Subclass
class CreditCardPayment extends Payment{
    private String cardNumber;
    
    //Constructor
    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    //Override method
    public void processPayment() {
        JOptionPane.showMessageDialog(null, "Processed credit card payment of PHP " + amount + " from card: " + cardNumber);
    }
}

//Subclass
class DebitCardPayment extends Payment{
    private String cardNumber;

    //Constructor
    public DebitCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    //Override method
    public void processPayment() {
        JOptionPane.showMessageDialog(null, "Processed debit card payment of PHP " + amount + " from card: " + cardNumber);
    }
}

//Subclass
class DigitalWalletPayment extends Payment{
    private String walletID;

    //Constructor
    public DigitalWalletPayment(double amount, String walletID) {
        super(amount);
        this.walletID = walletID;
    }
    
    @Override
    //Override method
    public void processPayment() {
        JOptionPane.showMessageDialog(null, "Processed digital wallet payment of PHP " + amount + " from wallet: " + walletID);
    }
}

public class PaymentProcessor {
    public static void main(String[] args) {
        //User options of payment method
        String[] options = { "Credit Card", "Debit Card", "Digital Wallet" };
        
        //Asks the user what payment method will the user use
        int choice = JOptionPane.showOptionDialog(null, "Select payment method:", "Payment System",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options);
        
        //When the user choose to exit
        while (choice == -1) {
            int confirm = JOptionPane.showConfirmDialog(null, "No option selected. Do you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Exiting...");
                return;
            }
        }
        
        double amount = 0;
        while (true) {
            try {
                String amountInput = JOptionPane.showInputDialog("Enter payment amount:");
                if (amountInput == null || amountInput.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid amount.");
                    continue;
                }
                amount = Double.parseDouble(amountInput);
                if (amount <= 0) {
                    JOptionPane.showMessageDialog(null, "Amount must be greater than zero.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
            }
        }
        
        //To reserve for Payment object before assigning it 
        Payment payment = null;
        
        while (true) {
            try {
                String input = "";
                switch (choice) {
                    case 0: //Credit Card
                        input = JOptionPane.showInputDialog("Enter credit card number:");
                        if (input == null || input.isEmpty()) throw new Exception("Card number cannot be empty.");
                        payment = new CreditCardPayment(amount, input);
                        break;
                    case 1: //Debit Card
                        input = JOptionPane.showInputDialog("Enter debit card number:");
                        if (input == null || input.isEmpty()) throw new Exception("Card number cannot be empty.");
                        payment = new DebitCardPayment(amount, input);
                        break;
                    case 2: //Digital Wallet
                        input = JOptionPane.showInputDialog("Enter digital wallet ID:");
                        if (input == null || input.isEmpty()) throw new Exception("Wallet ID cannot be empty.");
                        payment = new DigitalWalletPayment(amount, input);
                        break;
                }
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        
        //Checks if the payment is not empty
        if (payment != null) {
            payment.processPayment();
            JOptionPane.showMessageDialog(null, "Payment successful");
        }
    }
}
