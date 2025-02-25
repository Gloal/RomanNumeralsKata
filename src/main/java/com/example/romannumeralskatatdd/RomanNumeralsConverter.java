package com.example.romannumeralskatatdd;

import java.util.TreeMap;

public class RomanNumeralsConverter {

    private final TreeMap<Integer, String> romanConverter = new TreeMap<>();

    public RomanNumeralsConverter() {
        romanConverter.put(1, "I");
        romanConverter.put(4, "IV");
        romanConverter.put(5, "V");
        romanConverter.put(9, "IX");
        romanConverter.put(10, "X");
        romanConverter.put(40, "XL");
        romanConverter.put(50, "L");
        romanConverter.put(90, "XC");
        romanConverter.put(100, "C");
        romanConverter.put(400, "CD");
        romanConverter.put(500, "D");
        romanConverter.put(900, "CM");
        romanConverter.put(1000, "M");
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


