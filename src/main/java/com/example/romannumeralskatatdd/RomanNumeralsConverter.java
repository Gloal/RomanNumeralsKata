package com.example.romannumeralskatatdd;

import java.util.SortedMap;
import java.util.TreeMap;

import static java.util.Map.entry;

public class RomanNumeralsConverter {

    private final TreeMap<Integer, String> romanConverter = new TreeMap<>();

    public RomanNumeralsConverter() {
        romanConverter.put(1, "I");
        romanConverter.put(4, "IV");
        romanConverter.put(5, "V");
        romanConverter.put(9, "IX");
        romanConverter.put(10, "X");
        romanConverter.put(40, "XL");
    }


    public String convertToRomanNumerals(int num) {
        StringBuilder result = new StringBuilder();

        for (int value : romanConverter.descendingKeySet()) {
            while (num >= value) {
                result.append(romanConverter.get(value));
                num -= value;
            }
        }

        return String.valueOf(result);
    }
}


