package training.feature.ch02n03;

public class SolutionCh02n03 {
    public static void main(String[] args) {
        int maxSize = 10;
        HighArray arr;
        arr = new HighArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);
        arr.display();

        long[] arrSorted = new long[maxSize];
        int lengthCopy = maxSize;
        for (int i = 0; i < 10; i++) {
            arrSorted[lengthCopy-1] = arr.getMax();
            arr.removeMax();
            lengthCopy--;
        }

        for (long l : arrSorted) {
            System.out.println(l);
        }
    }
}
