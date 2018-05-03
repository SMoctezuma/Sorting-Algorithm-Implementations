package FA2016_LAB8;

import java.text.DecimalFormat;

public class BubbleSort {
    private int length;
    private int temp;
    private int[] data;
    public BubbleSort(int[] inputArr) {
        data = inputArr;
        length = inputArr.length;
        temp = 0;
        Sort();
    }
    private void Sort() {
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {

                if (data[j - 1] > data[j]) {
                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
    public void print(long time, int data) {
        long endTime = System.currentTimeMillis();
        System.out.println("\n***********************************");
        System.out.println("Sorting Method: Bubble Sort");
        System.out.println("Data: "+data+" random numbers");
        System.out.println("Start time: "+ time);
        System.out.println("Ending time: "+ endTime);
        double seconds = ((endTime-time)/1000f);
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.println("Sorting time (in seconds): " + df.format(seconds));
        System.out.println("***********************************\n");
    }
}
