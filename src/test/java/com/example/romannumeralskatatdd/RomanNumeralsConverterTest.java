package com.example.romannumeralskatatdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsConverterTest {

    private RomanNumeralsConverter rnc;
    @BeforeEach
    void setUp(){
        rnc = new RomanNumeralsConverter();
    }
    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "4 , IV",
            "5, V",
            "6, VI",
            "8, VIII",
            "9, IX",
            "10, X",
            "20, XX",
            "30, XXX",
            "33, XXXIII",
            "40, XL",
            "50, L",
            "60, LX",
            "69, LXIX",
            "95, XCV",
            "132, CXXXII",
            "350, CCCL"


    })
    void convertToRomanNumerals_ShouldReturnTheExpectedNumeralStrings(int input, String expected) {
        String actualValue = rnc.convertToRomanNumerals(input);
        assertEquals(expected, actualValue);
    }


}