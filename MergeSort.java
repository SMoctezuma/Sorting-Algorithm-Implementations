package FA2016_LAB8;

import java.text.DecimalFormat;

public class MergeSort {
    private int[] data;
    private int[] tempMergArr;
    private int length;

    public MergeSort(int[] inputArr) {
        data = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = data[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                data[k] = tempMergArr[i];
                i++;
            } else {
                data[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            data[k] = tempMergArr[i];
            k++;
            i++;
        }
    }
    public void print(long time, int data) {
        long endTime = System.currentTimeMillis();
        System.out.println("\n***********************************");
        System.out.println("Sorting Method: Merge Sort");
        System.out.println("Data: "+data+" random numbers");
        System.out.println("Start time: "+ time);
        System.out.println("Ending time: "+ endTime);
        double seconds = ((endTime-time)/1000f);
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Sorting time (in seconds): " + df.format(seconds));
        System.out.println("***********************************\n");
    }
}
