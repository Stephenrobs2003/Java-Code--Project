
package People;
import java.util.Random;
import java.util.Scanner;


public class EfficiencyTest{

	public static void main(String[] args) {
		Random ran=new Random();   
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Length for Array");
		int length=scan.nextInt();
		int[] arr = new int[length];	
	/*entering a length for array to be sorted*/
		
		for(int i=0;i<arr.length;i++) { /*made a new random array for each sorting method*/
			arr[i]=ran.nextInt();
		}
		
		long Start1 = System.currentTimeMillis(); /*getting the current system time*/
		bubblesort(arr);	/*sorting the array with bubble sort*/
		long End1 = System.currentTimeMillis(); /*getting current system time again*/

/*I then do the same for each of the sorting methods*/
		for(int i=0;i<arr.length;i++) {
			arr[i]=ran.nextInt();
		}
		
		long Start2 = System.currentTimeMillis();
		quicksortrecurrsion2(arr,0,arr.length-1);
		long End2 = System.currentTimeMillis();


		for(int i=0;i<arr.length;i++) {
			arr[i]=ran.nextInt();
		}
		
		long Start3 = System.currentTimeMillis();
		quicksortrecurrsion(arr,0,arr.length-1);
		long End3 = System.currentTimeMillis();


		for(int i=0;i<arr.length;i++) {
			arr[i]=ran.nextInt();
		}
		
		long Start4 = System.currentTimeMillis();
		quicksortrecurrsion3(arr,0,arr.length-1);
		long End4 = System.currentTimeMillis();


		for(int i=0;i<arr.length;i++) {
			arr[i]=ran.nextInt();
		}

		long Start5 = System.currentTimeMillis();
		MergeSort(arr);
		long End5 = System.currentTimeMillis();

		/*I then print the subtracted System time from after and before sorting the methods
		  to get the time it took to sort*/
		System.out.println("Total time taken for Bubble Sort completion: "+(End1-Start1)+" Milliseconds");
		System.out.println("Total time taken for QuickSort Low Index to complete: "+(End2-Start2)+" Milliseconds");
		System.out.println("Total time taken for QuickSort Middle Index to complete: "+(End3-Start3)+" Milliseconds");
		System.out.println("Total time for QuickSort High Index to complete: "+(End4-Start4)+" Milliseconds");
		System.out.println("Total time for MergeSort to complete: "+(End5-Start5)+" Milliseconds");
	}

/*quick sort middle index*/
	static int quicksort(int[] arr, int lowindex, int highindex) {
	int pivot=arr [(lowindex+highindex)/2]; /*Initialize the pivot as the middle index*/
	while(lowindex<=highindex) { /*while loop*/
		while(arr[lowindex]<pivot) {
			lowindex++;/*while the low index of the array is less than the pivot, the 
			lowindex is increased, moving the array one to the right*/
		}
		while(arr[highindex]>pivot) {
			highindex--;/*while the high index of the array is greater than the pivot, the 
			highindex is decreased, moving the array one to the left*/
		}
		if(lowindex<=highindex) { 
			int temp=arr[lowindex];
			arr[lowindex]=arr[highindex];
			arr[highindex]=temp;
			lowindex++;
			highindex--;
		/*if lowindex is equal to or less than highindex they are swapped, then low and high are
		 both moved to the right and left*/
		}
		}
		return lowindex;
	}
	static void quicksortrecurrsion(int[] arr, int lowindex, int highindex) {
		int pi=quicksort(arr,lowindex,highindex); /*pi is lowindex*/
		if (lowindex<pi-1) { /*if lowindex is less than pi minus one*/
			quicksortrecurrsion(arr,lowindex,pi-1);/*quicksortrecurrsion is ran again but pi-1
			is replaced for highindex*/
		}
		if (pi<highindex) {/*if pi is less than highindex*/
			quicksortrecurrsion(arr,pi,highindex);/*quicksortrecurrsion is ran again
			but low index is replaced with pi*/
		}
	}

	
/*quick sort Low index*/
		static int quicksort2(int[] arr, int lowindex, int highindex) {
			/*same as middle index
		except for one differences*/
		int pivot=arr [lowindex]; /*pivot = lowindex*/
		while(lowindex<=highindex) {
			while(arr[lowindex]<pivot) {
				lowindex++;
			}
			while(arr[highindex]>pivot) {
				highindex--;
			}
			if(lowindex<=highindex) {
				int temp=arr[lowindex];
				arr[lowindex]=arr[highindex];
				arr[highindex]=temp;
				lowindex++;
				highindex--;
			}
			}
			return lowindex;
		}
		static void quicksortrecurrsion2(int[] arr, int lowindex, int highindex) {
			int pi=quicksort2(arr,lowindex,highindex);
			if (lowindex<pi-1) {
				quicksortrecurrsion2(arr,lowindex,pi-1);
			}
			if (pi<highindex) {
				quicksortrecurrsion2(arr,pi,highindex);
			}
		}

		/*quick sort High index*/
				static int quicksort3(int[] arr, int lowindex, int highindex) {
				int pivot=arr [highindex]; /*pivot equals highindex*/
				while(lowindex<=highindex) {
					while(arr[lowindex]<pivot) {
						lowindex++;
					}
					while(arr[highindex]>pivot) {
						highindex--;
					}
					if(lowindex<=highindex) {
						int temp=arr[lowindex];
						arr[lowindex]=arr[highindex];
						arr[highindex]=temp;
						lowindex++;
						highindex--;
					}
					}
					return highindex; /*returns highindex*/
				}
				static void quicksortrecurrsion3(int[] arr, int lowindex, int highindex) {
					int pi=quicksort3(arr,lowindex,highindex); /*pi = highindex*/
					if (lowindex<pi) {
						quicksortrecurrsion3(arr,lowindex,pi);
					}
					if (pi+1<highindex) {
						quicksortrecurrsion3(arr,pi+1,highindex);
					}
				}

/*merge sort*/
	static void MergeSort(int[] arr) {
		int inputlength=arr.length;
		if(inputlength<2) {
			return; 
		}
		
		int midindex=inputlength/2; /*middle index is half of the input length*/
		int[]leftHalf=new int[midindex]; 
		int[]rightHalf=new int[inputlength-midindex];
		/*create 2 arrays half of the original in length*/
		for(int i=0;i<midindex;i++) {
			leftHalf[i]=arr[i]; 
		}
		for(int i=midindex;i< inputlength;i++) {
			rightHalf[i-midindex]=arr[i];
		}
		/*coping the numbers of the original array to the new half arrays*/
		MergeSort(leftHalf);
		MergeSort(rightHalf);
		/*sorting the 2 halves*/
		merge(arr,leftHalf,rightHalf); /*running merge method*/
	}
	
	private static void merge(int[]arr, int[]leftHalf, int[]rightHalf) {
		int leftsize=leftHalf.length; /*left size is the length of the left half*/
		int rightsize=rightHalf.length; /*right size is the length of the right half*/
		int i=0, j=0,k=0;
		while(i<leftsize && j< rightsize) {/*while i and j are less than left and right size*/
			if(leftHalf[i]<=rightHalf[j]) {
				arr[k]=leftHalf[i];
				i++;
			} /*if the left half is less than or equal to the right half then it replaces
			the original array number with that of the left half number*/
			else {
				arr[k]=rightHalf[j];
				j++;
				
			}/*if the left half is greater than the right half then it replaces
			the original array number with that of the right half number*/
			k++;
		}/*k is increased by one*/
		
		while(i<leftsize) { 
			arr[k]=leftHalf[i];
			i++;
			k++;
		}/*while i is less than the left size, the array position of k is replaced with left half
		position of i, i and k are then increased by one*/
		
		while(j<rightsize) {
			arr[k]=rightHalf[j];
			j++;
			k++;
		}/*while j is less than the right size, the array position of k is replaced with right half
		position of j, j and k are then increased by one*/
	}
	
/*bubble sort*/	
	static void bubblesort(int[] arr) {
		int temp = 0;
		for(int i=0; i < arr.length; i++){  
			for(int j=1; j < (arr.length-i); j++){  
				if(arr[j-1] > arr[j]){    /*if array position j-1 is greater than position j they switch places*/
					temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }                     
            }  
        }  
	}

}
