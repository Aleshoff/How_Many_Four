package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int pages = 250;
        char digitFourSearch = '4';

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        
        for (int i = 0; i < pages; i++) {
            integerArrayList.add(i + 1);
        }
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 1; i <= integerArrayList.size(); i++) {
            String temp = String.valueOf(i);
            stringArrayList.add(temp);
        }

        ArrayList <Character> charListWithFour = new ArrayList<>();
        for (String str : stringArrayList) {
            char[] charsArray = str.toCharArray();
            for (char character : charsArray) {
                if (character == digitFourSearch) {
                    Character element = character;
                    charListWithFour.add(element);
                }
            }
        }
       System.out.println(charListWithFour.size());
    }
}
