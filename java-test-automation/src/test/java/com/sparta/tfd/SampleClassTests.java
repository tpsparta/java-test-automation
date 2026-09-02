package com.sparta.tfd;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SampleClassTests {

//    @ParameterizedTest
//    @DisplayName("Given the String password, regardless of case, checkInput returns true")
//    @ValueSource(strings = {"PASSWORD", "password", "paSswOrd"})
//    public void givenTheStringPassword_RegardlessOfCase_CheckInput_ReturnsTrue(String str )
//    {
//        boolean result = Methods.checkInput(str);
//        Assertions.assertTrue(result);
//    }

    @Test
    @DisplayName("Check that accessing a private variable throws an exception")
    void access_test_1() {

        SampleClass a = new SampleClass("test", 1);

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> a.name);

        assertEquals("Cannot access private variable", ex.getMessage());
    }

}
