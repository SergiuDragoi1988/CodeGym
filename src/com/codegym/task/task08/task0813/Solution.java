package com.codegym.task.task08.task0813;

import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

/* 
20 words that start with the letter "L"

*/

public class Solution {
    public static Set<String> createSet() {
        //write your code here
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add("L" +i);

        }return set;
    }
    public static void main(String[] args) {
        createSet();

    }
}


