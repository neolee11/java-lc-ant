package com.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class myUtil {
    public static String IntArrayToString(int[] intArray){
        String strArray[] = Arrays.stream(intArray)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        return Arrays.toString(strArray);
    }
}