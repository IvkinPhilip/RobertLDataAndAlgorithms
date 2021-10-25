package training.feature.ch02n03;

import org.apache.commons.lang3.ArrayUtils;

public class HighArray {
    private long[] a;
    private int nElems; //


    public HighArray(int max) {
        a = new long[max];
        nElems = 0;
    }


    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++)
            if (a[j] == searchKey)
                break;
        return j != nElems;
    }


    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }


    public void delete(long value) {
        int j;
        for(j=0; j<nElems; j++)
            if( value == a[j] )
                break;
        if(j!=nElems)
        {
            if (nElems - 1 - j >= 0) System.arraycopy(a, j + 1, a, j, nElems - 1 - j);
            nElems--;
        }
    }


    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println();
    }

    public long getMax() {
        if (ArrayUtils.isNotEmpty(a)) {
            long max = a[0];
            for (int j = 0; j < nElems; j++) {
                if (a[j] > max) {
                    max = a[j];
                }
            }
            return max;

        } else {
            return -1;
        }
    }

    public void removeMax(){
        delete(getMax());
    }

}
