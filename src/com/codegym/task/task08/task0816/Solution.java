package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.util.Calendar.AUGUST;
import static java.util.Calendar.JUNE;

/* 
Kind Emma and the summer holidays
summer lasts from June 1 to August 31.

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Sergiu", df.parse("JUNE 1 1990"));
        map.put("Andrei", df.parse("AUGUST 5 1983"));
        map.put("Radu", df.parse("MAY 6 1986"));
        map.put("Vio", df.parse("JULY 7 1988"));
        map.put("Dan", df.parse("OCTOBER 8 1976"));
        map.put("Fane", df.parse("SEPTEMBER 9 1982"));
        map.put("George", df.parse("JANUARY 12 1999"));
        map.put("Cristi", df.parse("FEBRUARY 13 2003"));
        map.put("Marius", df.parse("JUNE 16 1986"));

        //write your code here
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //write your code here
        Calendar c = Calendar.getInstance();
        Iterator<Map.Entry<String,Date>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,Date> entry = it.next();
            c.setTime(entry.getValue());
            if (c.get(Calendar.MONTH) == 5 || c.get(Calendar.MONTH) == 6 || c.get(Calendar.MONTH )== 7){
                it.remove();
            }
        }

    }

    public static void main(String[] args) throws Exception{

        HashMap<String, Date> map2 = new HashMap<String, Date>();

        map2 = createMap();
        removeAllSummerPeople(map2);

    }
}