package  com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //In the main method, declare an ArrayList variable with Integer elements and immediately initialize it.
        ArrayList<Integer> list = new ArrayList<>();

        // inserting 10 numbers into list
        for (int i = 0; i < 10; i++) {
            Integer n = Integer.parseInt(br.readLine());
            list.add(n);
        }


        int counterA = 1;       // counter set to 1 (we start counting sequence at 1)
        int counterB = 0;       // in this variable we later save longest sequence

        for (int i = 0; i < list.size()-1; i++) {    // repeat until list.size() - 1 because in next line we get numbers from current index i + 1
            if (list.get(i).equals(list.get(i + 1))) // use equals for numbers > 127
                counterA++;                          //if 2 numbers are in sequence increase counter by 1
            else {
                if (counterA >= counterB)       // check if current sequence is bigger than last
                    counterB = counterA;            // save the biggest sequence in variable counterB
                counterA = 1;                   // reset the counter

            }



        }

        if (counterA>counterB) {   //we put this statement to check if last numbers from the list are in the biggest sequence ( because in if statement above you don't save it in counterB variable)
            counterB = counterA;

        }

        System.out.println(counterB);

    }

}