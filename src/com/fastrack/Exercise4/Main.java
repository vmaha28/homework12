package com.fastrack.Exercise4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Enum<Weekday>, List<String>> schedule=new HashMap<>();
        schedule.put(Weekday.MONDAY,List.of("running","eating","sleeping"));
        schedule.put(Weekday.TUESDAY,List.of("reading"));
        schedule.put(Weekday.WEDNESDAY,List.of("KillingTime"));
        schedule.put(Weekday.THURSDAY,List.of("learning IT"));
        schedule.put(Weekday.FRIDAY,List.of("dancing"));
        schedule.put(Weekday.SATURDAY,List.of("thinking of Sunday"));
        schedule.put(Weekday.SUNDAY,List.of("regreting not thinking enough about Saturday"));
        //System.out.println(schedule);
        System.out.println(schedule.get(Weekday.FRIDAY));
    }
}
