//COLLADO JOHN FRANK
//CITCS 1N A
package com.mycompany.finalslab2;
public class FinalsLab2 {

    public static void main(String[] args) {
        //2d array 3 cities 7 day temperatures
        int[][] citiesTemp = {
                {31, 28, 34, 23, 18, 37, 36},
                {20, 22, 39, 40, 38, 28, 25},
                {32, 23, 28, 23, 35, 30, 31}
        };
        
        
        for (int city = 0; city < citiesTemp.length; city++) {
            double totalTemp = 0;
            int highestTemp = Integer.MIN_VALUE; //to get the highest temperature
            
            
            for (int day = 0; day < citiesTemp[city].length; day++) {
                int temp = citiesTemp[city][day];
                totalTemp = totalTemp + temp;

                //gets the highest temperature of the city    
                if (temp > highestTemp) {
                    highestTemp = temp;
                }
            }
            
            //add all the 7 temperatures and divide it in 7 to get the average temperature
            double averageTemp = totalTemp / citiesTemp[city].length;
            
            //prints all the cities with their average and highest temperatures
            System.out.println("City " + (city + 1)+ ":");
            System.out.printf("  Average Temperature: %.2f\n", averageTemp);
            System.out.println("  Highest Temperature: " + highestTemp);
        }
    }
}
