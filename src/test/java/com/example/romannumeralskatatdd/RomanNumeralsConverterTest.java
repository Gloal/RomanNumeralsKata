package com.example.romannumeralskatatdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsConverterTest {
    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "4 , IV",
            "5, V",
            "6, VI",
            "8, VIII",
            "9, IX"
    })
    void convertToRomanNumerals_ShouldReturnTheExpectedNumeralStrings(int input, String expected) {
        RomanNumeralsConverter rnc = new RomanNumeralsConverter();
        String actualValue = rnc.convertToRomanNumerals(input);
        assertEquals(expected, actualValue);
    }


}