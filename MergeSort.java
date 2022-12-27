import java.util.Random;
public class MergeSort {
public static void main(String[] args) {
	MergeSort MrgeSrt = new MergeSort();
    Random rd = new Random();
    int[] size = {1000, 5000, 10000, 50000, 75000, 100000, 500000};
    for(int i = 0; i<size.length; i++) {
    	System.out.println("\nSize of array = " + size[i]);
    	System.out.println("\nRANDOM MERGE SORT");
    	int[] arr = new int[size[i]];
    	for (int j = 0; j < arr.length; j++) {
            arr[j] = rd.nextInt();
        }
        long start = System.currentTimeMillis();
        System.out.println("Start: " + start);
        MrgeSrt.MergeSort(arr);
        long end = System.currentTimeMillis();
        System.out.println("End: " + end);
        System.out.println("Total time = " + (end-start) + " ms");
        
        System.out.println("\nSORTED MERGE SORT");
        long start1 = System.currentTimeMillis();
        System.out.println("Start: " + start1);
        MrgeSrt.MergeSort(arr);
        long end1 = System.currentTimeMillis();
        System.out.println("End: " + end1);
        System.out.println("Total time = " + (end1-start1) + " ms");
        
    }
}
	/*
	MergeSort MrgtSrt = new MergeSort();
	Random rand = new Random();
	int[] size = {1000, 5000, 10000, 50000, 75000, 100000, 500000};
//int[] numbers= {6,3,45,100,67,78,12};
MergeSort(size);
printArray(size);
*/

  static void MergeSort(int[]numbers) {
  int inputlength=numbers.length;
  if(inputlength<2) {
  return;
  }
  int midindex=inputlength/2;
  int[]leftHalf=new int[midindex];
  int[]rightHalf =new int[inputlength-midindex];
  for(int i=0; i<midindex;i++) {
  leftHalf[i]=numbers[i];
  }
  for(int i=midindex; i<inputlength;i++) {
  rightHalf[i-midindex]=numbers[i];
  }
  MergeSort(leftHalf);
  MergeSort(rightHalf);
  merge(numbers,leftHalf,rightHalf);
  }
  static void merge(int[]numbers,int[]leftHalf,int[]rightHalf) {
  int leftsize=leftHalf.length;
  int rightsize=rightHalf.length;
  int i=0,j=0,k=0;
  while(i<leftsize && j<rightsize) {
  if(leftHalf[i]<=rightHalf[j]) {
  numbers[k]=leftHalf[i];
  i++;
  }
  else {
  numbers[k]=rightHalf[j];
  j++;
  
  }
  k++;
  }
  while(i<leftsize) {
  numbers[k]=leftHalf[i];
  i++;
  k++;
  }
  while(j<rightsize) {
  numbers[k]=rightHalf[j];
  j++;
  k++;
  }
  }
 static void printArray(int[] numbers) {
  for(int i=0; i<numbers.length;i++ ) {
  System.out.println(numbers[i]);
  }
  
  
  }
}
