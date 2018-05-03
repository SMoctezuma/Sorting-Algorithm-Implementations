package FA2016_LAB8;

import java.util.Random;
import java.util.Scanner;

public class Sorting_Driver {
    public static void main(String args[]) {
        boolean isRunning = true;
        //Array is of size 100,000
        //So max index is 99,999
        int dataSet = 100000;
        int[] numbers = new int[dataSet];
        Random rand = new Random();
        for(int iter = 0, max = dataSet;iter < max;iter++) {
            numbers[iter] = rand.nextInt(max)+1;
        }
        /*
        Generate the random numbers out of the while loop so its the
        numbers being tested.
        */
        while(isRunning) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("1. Bubble Sort\n2. Binary Tree Sort\n3. Quick Sort\n4. Merge Sort\n5. Quit");
            int UI = userInput.nextInt();
            long startTime = System.currentTimeMillis();
            switch (UI) {
                case 1:
                    BubbleSort BS = new BubbleSort(numbers);
                    BS.print(startTime,dataSet);
                    break;
                case 2:
                    BinaryTreeSort BTS = new BinaryTreeSort(new Integer(numbers[0]));
                    for(int i = 1; i < numbers.length; i++) {
                        BTS.insert(BTS.root, new Integer(numbers[i]));
                    }
                    BTS.print(startTime, dataSet);
                    System.out.println("Do you want to see the results?(y/n)");
                    Scanner y = new Scanner(System.in);
                    String yes = y.nextLine();
                    if(yes.matches("[yY]"))
                        BTS.ShowAll_LNR(BTS.root);
                    break;
                case 3:
                    QuickSort QS = new QuickSort(numbers);
                    QS.print(startTime, dataSet);
                    break;
                case 4:
                    MergeSort MS = new MergeSort(numbers);
                    MS.print(startTime, dataSet);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Please enter a valid integer.");

            }
        }
    }
}
