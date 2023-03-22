package ru.netology.services.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.CalcService;

public class CalcServiceTest {

    @Test
    public void test1() {
        CalcService service = new CalcService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource (files ="src/test/resources/Data-in.csv")

    public void test2(int expected, int income, int expenses, int threshold) {
        CalcService service = new CalcService();

        //int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
