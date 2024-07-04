package com.example.romannumeralskatatdd;

public class RomanNumeralsConverter {

    public String convertToRomanNumerals(int num) {
        StringBuilder result = new StringBuilder();

        if (num <= 3) {
            result.append("I".repeat(Math.max(0, num)));
            return String.valueOf(result);
        }

        if (num == 4) {
            return String.valueOf(result.append("IV"));
        }

        if(num == 5){
            return String.valueOf(result.append("V"));
        }

        if(num > 5 && num < 10){
            String prefix = convertToRomanNumerals(5);
            int remainder = num % 5;
            if (remainder == 4){
                return String.valueOf(result.append("IX"));

            }
            String suffix = convertToRomanNumerals(num % 5);
            return prefix+suffix;
        }

        if(num >=10){
            result.append("X".repeat(Math.max(0, num/10)));
            int remainder = num % 10;
            String suffix = convertToRomanNumerals(remainder);
            return String.valueOf(result.append(suffix));
        }
        return String.valueOf(result);
    }
}
