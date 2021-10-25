package training.feature.ch02n05;

public class SolutionCh02n05 {
    public static void main(String[] args) {
        int[] first = new int[10];
        int[] second = new int[12];

        for (int i = 0; i < first.length; i++) {
            first[i] = (int) Math.round((Math.random() * 31) - 15);
        }

        for (int i = 0; i < second.length; i++) {
            second[i] = (int) Math.round((Math.random() * 47) - 24);
        }
        OrdArray arr = new OrdArray();
        int[] arrMerge = arr.merge(first, second);
        for (int i = 0; i < arrMerge.length; i++) {
            System.out.println(arrMerge[i]);
        }
    }
}
