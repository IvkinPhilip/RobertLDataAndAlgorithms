package training.feature.ch02n05;

import java.util.Arrays;

public class OrdArray {

    private long[] a;
    private int nElems;

    public OrdArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public OrdArray() {

    }

    public int size() {
        return nElems;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey)
                return curIn;
            else if (lowerBound > upperBound)
                return nElems;
            else {
                if (a[curIn] < searchKey)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }
    }

    public void insert(long value) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;

            if (lowerBound > upperBound)
                break;
            else {
                if (a[curIn] < value)
                    lowerBound = curIn + 1;
                else
                    upperBound = curIn - 1;
            }
        }

        if (nElems - lowerBound >= 0) System.arraycopy(a, lowerBound, a, lowerBound + 1, nElems - lowerBound);

        a[lowerBound] = value;
        nElems++;
    }

    public void delete(long value) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        boolean condition = true;

        while (condition) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == value) {
                if (nElems - curIn >= 0) System.arraycopy(a, curIn + 1, a, curIn, nElems - curIn);
                nElems--;
            } else if (lowerBound > upperBound)
                condition = false;
            else if (a[curIn] < value)
                lowerBound = curIn + 1;
            else
                upperBound = curIn - 1;
        }
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println("");
    }

    public int[] merge(int[] firstArr, int[] secondArr) {
        int[] arrMerge = new int[firstArr.length + secondArr.length];
        for (int i = 0; i < arrMerge.length; i++) {
            if (i < firstArr.length) {
                arrMerge[i] = firstArr[i];
            } else {
                arrMerge[i] = secondArr[i - firstArr.length];
            }
        }

        Arrays.sort(arrMerge);

        return arrMerge;
    }

}

