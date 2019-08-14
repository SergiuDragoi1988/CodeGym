package com.codegym.task.task08.task0802;

/* 
HashMap of 10 pairs
HashMap of 10 pairs
Create a HashMap<String, String>, and add 10 string pairs:
watermelon - melon,
banana - fruit,
cherry - fruit,
pear - fruit,
cantaloupe - melon,
blackberry - fruit,
ginseng - root,
strawberry - fruit,
iris - flower,
potato - tuber.
Display the contents of the collection, each element on a new line.

Example output: (here we just show one line):
potato - tuber


Requirements:
1. Declare a HashMap variable with (String, String) pairs and immediately initialize it.
2. The program should not read values from the keyboard.
3. The program should add 10 string pairs to the collection in accordance with the conditions.
4. The program should display the contents of the collection on the screen, each pair on a new line.

*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        HashMap<String,String> list = new HashMap<>();
        list.put("watermelon","melon");
        list.put("banana","fruit");
        list.put("cherry","fruit");
        list.put("pear","fruit");
        list.put("cantaloupe","melon");
        list.put("blackberry","fruit");
        list.put("ginseng","root");
        list.put("strawberry","fruit");
        list.put("iris","flower");
        list.put("potato","tuber");


        Iterator<Map.Entry<String, String>> iterator = list.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();

            String key = pair.getKey();
            String value = pair.getValue();

            System.out.println(key + " - " + value);



    }


    }
}
