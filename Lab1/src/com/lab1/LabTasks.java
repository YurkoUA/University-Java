package com.lab1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LabTasks {
    private double resultR, resultS;
    private double varA, varB, varX;
    
    public void printDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat.format(new Date()));
    }
    
    public void printResults() {
        System.out.println(String.format("r = %f\ns = %f", resultR, resultS));
    }
    
    public void calculate() {
        resultR = Math.pow(varX, 2) * ((varX + 1) / varB) - Math.pow(Math.sin(varX + varA), 2);
        resultS = Math.sqrt((varX * varB) / varA) + Math.pow(Math.cos(Math.pow(varX + varB, 3)), 3);
    }
    
    public void inputVariables() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input a: ");
        varA = sc.nextDouble();
        
        System.out.println("Input b: ");
        varB = sc.nextDouble();
        
        System.out.println("Input x: ");
        varX = sc.nextDouble();
    }
}
