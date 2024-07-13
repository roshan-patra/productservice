package com.bharath.springcloud.controller;


import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
       /* Print second largest occurring element in a string and its count
        Input - hellloo
        Output -  o:2*/
        String s = "hellloo";
        String[] str = s.split("");
        /*Arrays.asList(str)
                .stream()
                .collect(Collectors.);*/
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        int count = 1;
        for(String s1 : str){
            if(!set.add(s1)){
                count++;
                map.put(s1,count);
            }else{
                set.add(s1);
                map.put(s1, count);
            }
            count= 1;
        }
        System.out.println(map);

        Map<String, Integer> map = new HashMap<>();
        map.entrySet()
                .stream().sorted()
                .skip(1)
                .limit(1)
                .forEach(map1-> System.out.println(map1));

    }

}
