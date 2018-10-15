package com.lab3;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    String inputText = JOptionPane.showInputDialog("Input text:");
	    
	    if (inputText != null && !inputText.isEmpty()) {
            Pattern pattern = Pattern.compile("\\d");
            Matcher matcher = pattern.matcher(inputText);
            
            int count = 0;
            
            while (matcher.find())
                count++;
            
            JOptionPane.showMessageDialog(null, "Digits found: " + count);
        }
        else {
            JOptionPane.showMessageDialog(null, "The string is null or empty.");
        }
    }
}
