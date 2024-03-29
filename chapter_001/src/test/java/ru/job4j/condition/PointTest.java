package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distance(second);
        first.info();
        second.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }

    @Test
    public void when3dZeroAndTenThenTen() {
        Point x = new Point(0, 0,0);
        Point y = new Point(0, 0,10);
        double result = x.distance3d(y);
        x.info3d();
        y.info3d();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }


    @Test
    public void whenCheckItself() {
        Point point = new Point(0, 0);
        double result = point.distance(point);
        assertThat(result, is(0D));
    }

    @Test
    public void whenShowInfo() {
        Point first = new Point(1, 1);
        first.info();
        Point second = new Point(2, 2);
        second.info();
    }
    @Test
    public void whenShowInfo3d() {
        Point x = new Point(1, 1,2);
        x.info3d();
        Point y = new Point(2, 2,4);
        y.info3d();
    }
}
