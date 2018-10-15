package com.lab2;

public class ArrayHelper {
    public static <T> String join(T[] array, String separator) {
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            
            if (i != array.length - 1) {
                builder.append(separator);
            }
        }
        
        return builder.toString();
    }
}
