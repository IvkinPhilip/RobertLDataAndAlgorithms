package training.feature.ch02n01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HighArrayTest {

    @Test
    void testGetMaxArrDefault() {
        int maxSize = 100;
        HighArray testArrDefault;
        testArrDefault = new HighArray(maxSize);
        assertEquals(0, testArrDefault.getMax());
    }

    @Test
    void testGetMaxArrLengthZero() {
        int maxSize = 0;
        HighArray testArrLengthZero;
        testArrLengthZero = new HighArray(maxSize);
        assertEquals(-1, testArrLengthZero.getMax());
    }

    @Test
    void testGetMaxArrWithArgs() {
        int maxSize = 100;
        HighArray arrWithArgs;
        arrWithArgs = new HighArray(maxSize);

        arrWithArgs.insert(77);
        arrWithArgs.insert(99);
        arrWithArgs.insert(44);
        arrWithArgs.insert(55);
        arrWithArgs.insert(22);
        arrWithArgs.insert(88);
        arrWithArgs.insert(11);
        arrWithArgs.insert(0);
        arrWithArgs.insert(66);
        arrWithArgs.insert(33);
        assertEquals(99, arrWithArgs.getMax());
    }
}