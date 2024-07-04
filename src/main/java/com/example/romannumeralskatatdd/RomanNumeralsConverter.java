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

        if(num == 5){
            return "V";
        }

        if(num > 5){
            String prefix = convertToRomanNumerals(5);
            int remainder = num % 5;
            if (remainder == 4){
                return "IX";

            }
            String suffix = convertToRomanNumerals(num % 5);
            return prefix+suffix;
        }
        return null;
    }
}
