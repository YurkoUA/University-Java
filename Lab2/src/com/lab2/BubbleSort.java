package com.lab2;

public class BubbleSort {
    public static Double[] sortArray(Double[] source) {
        if (source.length <= 1)
            return source;
        
        Double[] dest = source.clone();
        
        boolean swapped;
        
        do {
            swapped = false;
            
            for (int i = 0; i < dest.length - 1; i++) {
                if (dest[i] > dest[i + 1]) {
                    Double temp = dest[i];
                    dest[i] = dest[i + 1];
                    dest[i + 1] = temp;
                    
                    swapped = true;
                }
            }
        }
        while (swapped);
        
        return dest;
    }
}
