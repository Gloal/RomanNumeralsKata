package com.example.romannumeralskatatdd;

public class RomanNumeralsConverter {

    public String convertToRomanNumerals(int num) {
        StringBuilder result = new StringBuilder();

        if (num <= 3) {
            for (int i = 0; i < num; i++) {
                result.append("I");

            }
            return String.valueOf(result);
        }

        if (num == 4) {
            return "IV";
        }
        return null;
    }
}
