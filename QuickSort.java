package FA2016_LAB8;

import java.text.DecimalFormat;

public class QuickSort {
    private int[] data;
    private int length;

    public QuickSort(int[] inputArr) {
        data = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = data[lowerIndex+(higherIndex-lowerIndex)/2];
        while (i <= j) {
            while (data[i] < pivot) {
                i++;
            }
            while (data[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
    public void print(long time, int data) {
        long endTime = System.currentTimeMillis();
        System.out.println("\n***********************************");
        System.out.println("Sorting Method: Quick Sort");
        System.out.println("Data: "+data+" random numbers");
        System.out.println("Start time: "+ time);
        System.out.println("Ending time: "+ endTime);
        double seconds = ((endTime-time)/1000f);
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Sorting time (in seconds): " + df.format(seconds));
        System.out.println("***********************************\n");
    }
}
