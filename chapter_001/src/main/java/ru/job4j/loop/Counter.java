package ru.job4j.loop;
/**
 * @author Vladislav (fn1235@bk.ru)
 * @version $Id$
 * @since 0.1
 */
public class Counter {
    /**
     * @param start
     * @param finish
     * @return sum
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
           if (i % 2 == 0) {
               sum = sum + i;
           }
        }
            return sum;
    }
}
