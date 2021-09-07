package com.sales.market.util;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NumericUtilsTest {

    private static final String ONE_ROMAN = "I";
    private static final String TWO_ROMAN = "II";

    @org.testng.annotations.Test
    public void testToRoman() {
        NumericUtils numericUtils = new NumericUtils();
        String roman = numericUtils.toRoman(1);
        assertEquals(roman, ONE_ROMAN);
    }

    @org.testng.annotations.Test
    public void testToArabic() {
        NumericUtils numericUtils = new NumericUtils();
        Integer arabic = numericUtils.toArabic("I");
        assertTrue(arabic == 1);
    }

    @org.testng.annotations.Test
    public void givenNotCoveredScenarioWhenTestRomanThenFail() {
        NumericUtils numericUtils = new NumericUtils();
        String roman = numericUtils.toRoman(2);
        assertEquals(roman, TWO_ROMAN);
    }
}