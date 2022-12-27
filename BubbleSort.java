// Java program for implementation of Bubble Sort
import java.util.Random;
class BubbleSort {
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        Random rd = new Random();
        int[] size = {1000, 5000, 10000, 50000, 75000, 100000, 500000};
        for(int i = 0; i<size.length; i++) {
        	System.out.println("\nSize of array = " + size[i]);
        	System.out.println("\nRANDOM BUBBLE SORT");
        	int[] arr = new int[size[i]];
        	for (int j = 0; j < arr.length; j++) {
                arr[j] = rd.nextInt();
            }
            long start = System.currentTimeMillis();
            System.out.println("Start: " + start);
            ob.bubbleSort(arr);
            long end = System.currentTimeMillis();
            System.out.println("End: " + end);
            System.out.println("Total time = " + (end-start) + " ms");
            
            System.out.println("\nSORTED BUBBLE SORT");
            long start1 = System.currentTimeMillis();
            System.out.println("Start: " + start1);
            ob.bubbleSort(arr);
            long end1 = System.currentTimeMillis();
            System.out.println("End: " + end1);
            System.out.println("Total time = " + (end1-start1) + " ms");
            
            
            //System.out.println("Sorted array:");
            //ob.printArray(arr);
        }
//        int[] arr = new int[500000];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rd.nextInt();
//        }
//        long start = System.currentTimeMillis();
//        System.out.println("RANDOM BUBBLE SORT");
//        System.out.println("Start: " + start);
//        ob.bubbleSort(arr);
//        long end = System.currentTimeMillis();
//        System.out.println("End: " + end);
//        System.out.println("Total time = " + (end-start) + " ms");
        
        //System.out.println("Sorted array:");
        //ob.printArray(arr);
    }
}
