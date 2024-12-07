/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finallab3;

import java.util.Scanner;

public class FinalLab3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array to store student names
        String[] studentNames = new String[5];
        //array to store student grades
        double[][] grades = new double[5][3];
        //array to store average grades 
        double[] averageGrades = new double[5];

        //asks the user to input names of student
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = sc.nextLine();
        }

        //asks the user to input grades for each student
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Enter grades for " + studentNames[i] + ":");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                grades[i][j] = sc.nextDouble();
            }
        }

        //calculates the average grade for each student
        for (int i = 0; i < studentNames.length; i++) {
            double total = 0;
            for (int j = 0; j < grades[i].length; j++) {
                total += grades[i][j];
            }
            averageGrades[i] = total / grades[i].length;
        }

        //prints the student names with their average grade
        System.out.println("\nStudent Average Grades:");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i] + ": " + averageGrades[i]);
        }

        sc.close();
    }
}
