import java.util.Scanner;
import java.util.Arrays;
public class ReversingArray
{   
    
    static void doesReverseOfTheArray(int[] arrOfIntegers) {
    int initialIndex = 0; 
    int finalIndex = arrOfIntegers.length - 1 ;
    while (initialIndex < finalIndex) {
       
        int temporarayStorage = arrOfIntegers[initialIndex];
        arrOfIntegers[initialIndex] =arrOfIntegers[finalIndex];
        arrOfIntegers[finalIndex] = temporarayStorage;
        initialIndex = initialIndex + 1;
       finalIndex = finalIndex - 1;
    }
}
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter a number");
	    int n=scan.nextInt();
	    System.out.println("Enter "+n+" numbers");
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=scan.nextInt();
	    }
	    System.out.println("The input array is");
	    for(int i=0;i<n;i++){
	        System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	   doesReverseOfTheArray(arr);	   System.out.println("Reverse of the input array is");
	   for(int i=0;i<arr.length;i++){
	       System.out.print(arr[i]+" ");
	   }
	   int arr2[]=arr;
	   Arrays.sort(arr2);//sort() is a method present in the Arrays class.
	                     //It is used to sort elements of the array in ascending order.
	   System.out.println();
	   System.out.println("Sorted array is");
	   for(int i=0;i<arr2.length;i++){
	       System.out.print(arr2[i]+" ");
	   }
	   
	   
	}
}