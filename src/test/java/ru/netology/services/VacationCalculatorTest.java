package ru.netology.services;

import org.junit.Assert;
import org.junit.Test;

public class VacationCalculatorTest {

    @Test
    public void testCalculateVacationMonths() {
        VacationCalculator calculator = new VacationCalculator();

        int income = 20000;
        int expenses = 5000;
        int threshold = 35000;

        int result = calculator.calculateVacationMonths(income, expenses, threshold);
        Assert.assertEquals(3, result); // Ожидаемое количество месяцев
    }
}
