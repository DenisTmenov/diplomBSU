package com.denis.diplom.utils;

import java.util.Random;

public class Utils {
    private static Random rand;


    public static Random getRand() {
        if (rand == null) {
            rand = new Random();
        }
        return rand;
    }
}
