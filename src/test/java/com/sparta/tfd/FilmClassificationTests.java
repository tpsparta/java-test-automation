package com.sparta.tfd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FilmClassificationTests {

    @ParameterizedTest
    @DisplayName("Film classification tests")
    @CsvSource({
            "11, \"U, PG & 12 films are available.\"",
            "12, \"U, PG, 12 & 15 films are available.\"",
            "14, \"U, PG, 12 & 15 films are available.\"",
            "15, \"All films are available.\""
    })
    public void fc_test_1(int age, String expectedRes)
    {
        Assertions.assertTrue(expectedRes == FilmClassification.getClassificationsByAge(age));
    }

}
