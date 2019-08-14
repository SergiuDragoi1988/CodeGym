package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/*
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("Joshi","Shreyas");
        map.put("Shah","Sujata");
        map.put("Gala","Anjali");
        map.put("Ahmed","Sana");
        map.put("Maheshwari","Uday");
        map.put("Sharma","Mahesh");
        map.put("Verma","Haresh");
        map.put("Garival","Omkar");
        map.put("Kapur","Sanjiv");
        map.put("Pandya","Laxmi");

return map;
    }


    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int firstNameCount = 0;

        for (HashMap.Entry<String, String> namePair : map.entrySet()) {
            if (namePair.getValue().equalsIgnoreCase(name))
                firstNameCount++;
        }

        return firstNameCount;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int lastNameCount = 0;
        for (HashMap.Entry<String, String> namePair : map.entrySet()) {
            if (namePair.getKey().equalsIgnoreCase(lastName))
                lastNameCount++;
        }

        return lastNameCount;

    }

    public static void main(String[] args) {



    }
}
