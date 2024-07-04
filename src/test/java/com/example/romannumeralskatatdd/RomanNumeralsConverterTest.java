package com.example.romannumeralskatatdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsConverterTest {

    @Test
    void returnsI_whenGiven1(){
        RomanNumeralsConverter rnc = new RomanNumeralsConverter();
        Assertions.assertEquals(rnc.convertOneToRomanNumerals(1),"I");
    }

    @Test
    void returnsII_whenGiven2(){
        RomanNumeralsConverter rnc = new RomanNumeralsConverter();
        assertEquals(rnc.convertTwoToRomanNumerals(2), "II");

    }

}