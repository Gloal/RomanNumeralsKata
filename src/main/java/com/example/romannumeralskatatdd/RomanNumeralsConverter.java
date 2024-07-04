package com.example.romannumeralskatatdd;

public class RomanNumeralsConverter {

    public String convertToRomanNumerals(int num){
        StringBuilder result = new StringBuilder();
        for(int i=0; i < num; i++){
            result.append("I");

        }
        return result.toString();
    }

}
