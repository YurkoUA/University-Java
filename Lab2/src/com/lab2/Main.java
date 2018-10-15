package com.lab2;

public class Main {
    public static void main(String[] args) {
        Double[] array = { 1d, 4d, 8d, 8d, 10d, 3d, 13d, 7d, 14d, 1d };
        Double[] sorted = BubbleSort.sortArray(array);
        
        System.out.println(ArrayHelper.<Double>join(sorted, ", "));
    }
}
