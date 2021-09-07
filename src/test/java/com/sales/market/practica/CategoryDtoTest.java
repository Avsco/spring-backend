package com.sales.market.practica;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CategoryDtoTest {

    @Test
    public void givenCategoryDTOWithCodeLengthLessThanMinimunSizeWhenCategoryDTO_validateThenCheckedErrorShouldBeCatchAndYouShouldRecoverWithTrailingXCharacters() {
        boolean sanitized = Boolean.FALSE;
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setCode("ABC");
        try {
            categoryDto.validate();
        } catch (CheckedException checkedException) {
            try {
                categoryDto.validate();
                sanitized = true;
            } catch (CheckedException checkedException1) {
            }
        }

        System.out.println("Interesante forma de validar si esta sanitizado el codigo \n" +
                "Hay distintos asserts para validar los test");

        assertTrue(sanitized);
    }

    @Test(expectedExceptions = {CheckedException.class})
    public void givenCategoryDTOWithCodeLengthLessThanMinimunSizeWhenCategoryDTO_validateUncheckedThenUncheckedErrorShouldBeThrown() throws CheckedException {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setCode("ABC");
        categoryDto.validateUnchecked();

        System.out.println("Deberia de haber otra forma de esperar excepciones en testng");
    }
}