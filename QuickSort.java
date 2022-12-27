import java.util.Random;
public class QuickSort {
public static void main(String[] args) {
// TODO Auto-generated method stub
Random rand=new Random();
QuickSort qs = new QuickSort();
int[] size = {1000, 5000, 10000, 50000, 75000, 100000, 500000};
for(int i = 0; i<size.length; i++) {
	System.out.println("\nSize of array = " + size[i]);
	System.out.println("\nRANDOM QUICK SORT");
	int[] arr = new int[size[i]];
	for (int j = 0; j < arr.length; j++) {
        arr[j] = rand.nextInt();
    }
    long start = System.currentTimeMillis();
    System.out.println("Start: " + start);
    qs.quicksort(arr);
    long end = System.currentTimeMillis();
    System.out.println("End: " + end);
    System.out.println("Total time = " + (end-start) + " ms");
    
    System.out.println("\nSORTED QUICK SORT");
    long start1 = System.currentTimeMillis();
    System.out.println("Start: " + start1);
    qs.QuickSort(arr);
    long end1 = System.currentTimeMillis();
    System.out.println("End: " + end1);
    System.out.println("Total time = " + (end1-start1) + " ms");
}
}
/*int[] numbers= {6,3,90,45,32,89};
QuickSort obj1=new QuickSort();
long start1 = System.currentTimeMillis();
obj1.printArray(numbers);
obj1.quicksortrecurrsion(numbers,0,numbers.length-1);
System.out.println("After");
obj1.printArray(numbers);
long end1 = System.currentTimeMillis();      
System.out.println("Elapsed Time in milliseconds: "+ (end1-start1));
*/

int quicksort(int[] numbers, int lowindex,int highindex) {
int pivot=numbers[(highindex)];
while(lowindex<=highindex){
while(numbers[lowindex]<pivot) {
lowindex++;
}
while(numbers[highindex]>pivot) {
highindex--;
}
if(lowindex<=highindex) {
int temp=numbers[lowindex];
numbers[lowindex]=numbers[highindex];
numbers[highindex]=temp;
lowindex++;
highindex--;
}
}
 return highindex;
}
 void quicksortrecurrsion(int[] numbers, int lowindex, int highindex) {
int pi=quicksort(numbers,lowindex,highindex);
if(lowindex<pi) {
quicksortrecurrsion(numbers,lowindex,pi);
}
if(pi+1<highindex) {
quicksortrecurrsion(numbers,pi+1,highindex);
}
}
 void printArray(int[] numbers) {
for(int i=0; i<numbers.length;i++) {
System.out.println(numbers[i]);
}
}
}