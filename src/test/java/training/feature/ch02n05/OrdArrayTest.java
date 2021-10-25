package training.feature.ch02n05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrdArrayTest {

    @Test
    void testMergeArgEqually() {
        int[] first = new int[]{1, 3, 5, 7, 9};
        int[] second = new int[]{2, 4, 6, 8, 10};
        int[] result = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        OrdArray arr = new OrdArray();
        int[] testArr = arr.merge(first, second);

        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], testArr[i]);
        }
    }

    @Test
    void testMergeArgELess() {
        int[] first = new int[]{1, 3, 5, 7};
        int[] second = new int[]{2, 4, 6, 9, 8, 10};
        int[] result = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        OrdArray arr = new OrdArray();
        int[] testArr = arr.merge(first, second);

        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], testArr[i]);
        }
    }

    @Test
    void testMergeArgMore() {
        int[] first = new int[]{1, 3, 10, 5, 7, 9};
        int[] second = new int[]{2, 4, 6, 8};
        int[] result = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        OrdArray arr = new OrdArray();
        int[] testArr = arr.merge(first, second);

        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], testArr[i]);
        }
    }
    }