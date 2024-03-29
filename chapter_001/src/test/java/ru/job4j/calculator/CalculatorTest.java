package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDiv2On2() {
        Calculator calc = new Calculator();
        double result = calc.div(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubtract2On2() {
        Calculator calc = new Calculator();
        double result = calc.subtract(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultiple2On2() {
        Calculator calc = new Calculator();
        double result = calc.multiple(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

}
