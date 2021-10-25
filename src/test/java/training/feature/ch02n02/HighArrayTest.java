package training.feature.ch02n02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HighArrayTest {

    @Test
    void testRemoveMax() {
        int maxSize = 100;
        HighArray testArrDefault;
        testArrDefault = new HighArray(maxSize);
        testArrDefault.insert(77);
        testArrDefault.insert(99);
        testArrDefault.insert(44);
        testArrDefault.insert(55);
        testArrDefault.insert(22);
        testArrDefault.insert(88);
        testArrDefault.insert(11);
        testArrDefault.insert(0);
        testArrDefault.insert(66);
        testArrDefault.insert(33);

        testArrDefault.removeMax();

        assertEquals(false, testArrDefault.find(99));

        testArrDefault.removeMax();

        assertEquals(false, testArrDefault.find(88));
    }
}