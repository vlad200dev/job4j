package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenLeftIsMaxThenLeft() {
        Max max = new Max();
        int result = max.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenRightIsMaxThenRight() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenRightIsEqualLeft() {
        Max max = new Max();
        int result = max.max(1, 1);
        assertThat(result, is(1));
    }
    @Test
    public void fromFourIsMax() {
        Max max = new Max();
        int result = max.max(1, 1,4,3);
        assertThat(result, is(4));
    }
    @Test
    public void fromThreeIsMax() {
        Max max = new Max();
        int result = max.max(1, 5,3);
        assertThat(result, is(5));
    }
}
