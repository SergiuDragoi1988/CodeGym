package com.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us
Greater than 10? You're not a good fit for us
Create a set of numbers (Set<Integer>) and add 20 different numbers to it.
Remove from the set all numbers greater than 10 .


Requirements:
1. The program should not display text on the screen.
2. The program should not read values from the keyboard.
3. The Solution class must have only three methods.
4. The createSet() method must create and return a HashSet containing 20 different numbers.
5. The removeAllNumbersGreaterThan10() method must remove from the set all numbers greater than 10.

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // write your code here
        HashSet<Integer> set  = new HashSet<>();
        for(int i = 0; i < 20; i++){
            set.add(i);
        }
        return set;

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // write your code here
        for (Iterator<Integer> it = set.iterator();it.hasNext();){
            Integer next = it.next();
            if (next > 10) {
                it.remove();
            }
        }return set;
    }

    public static void main(String[] args) {


    }
}
