package com.lab1;

import java.util.Scanner;

public class Main {
    static LabTasks tasks = new LabTasks();
    
    public static void main(String[] args) {
        try {
            System.out.println("Current date: ");
            tasks.printDate();
            System.out.println("\n");

            tasks.inputVariables();
            tasks.calculate();
            tasks.printResults();
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        new Scanner(System.in).next();
    }
}
