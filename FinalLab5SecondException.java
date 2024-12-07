package com.mycompany.finallab5secondexception;

import javax.swing.JOptionPane;
public class FinalLab5SecondException {

     public static void main(String[] args) {
        //initialize attributes
        int totalSeats = 10;
        int bookedSeats = 0;

        
        while (true) {
            try {
                //calculating the available seats and subtracting the total seats to the already booked seats
                int availableSeats = totalSeats - bookedSeats;
                //conditional exception for catch
                if (availableSeats == 0) {
                    throw new Exception("Sorry this flight is fully booked");
                }
                //option to continue or exit
                int option = JOptionPane.showConfirmDialog(
                    null, "Available seats " + availableSeats + " Do you want to book?", 
                    "Booking", 
                    JOptionPane.YES_NO_OPTION);
                //if user picked the no option the program will exit
                if (option == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(
                    null, 
                    "Thank you for using the flight booking system");
                    break;
                //or if the user picked yes then the flight will be booked
                }else{
                    JOptionPane.showMessageDialog(null, "flight booked successfully thank you for booking!");
                    bookedSeats++;
                }

            } 
            
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Booking Error", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    }
}
