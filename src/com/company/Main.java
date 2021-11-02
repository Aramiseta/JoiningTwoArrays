package com.company;

import java.util.ArrayList;
import java.util.List;

// Write a Java program to join two array lists
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> one = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        ArrayList<Integer> two = new ArrayList<>(List.of(9,2,3,4,6));
        one.addAll(two);
        for(Integer s : one){
            System.out.println(one.get(s));
        }


    }
}
