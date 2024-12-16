package com.epam.rd.autotasks;

import java.util.Arrays;

public class Sorting {
    public void sort(int[] array){
        if (array != null) {
            Arrays.sort(array);
        } else {
            throw new IllegalArgumentException("Unexpected exception: array is null");
        }
    }
}
