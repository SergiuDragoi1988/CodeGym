package com.codegym.task.task08.task0806;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
HashMap of Objects

HashMap of Objects
There is a HashMap<String, Object>. 10 different object pairs have been added to it.
Display the contents of the collection, each element on a new line.

Example output: (here we just show one line):
Sim - 5


Requirements:
1. The program must create a HashMap variable with (String, Object) elements. The variable must be initialized immediately.
2. The program should not read values from the keyboard.
3. The program should add 10 different objects to the collection in accordance with the conditions.
4. The program should display the contents of the collection on the screen, each pair on a new line.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //write your code here
        Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, Object> pair = iterator.next();

            Object value = pair.getValue();
            String key = pair.getKey();

            System.out.println(key + " - " + value);

        }
    }
}
