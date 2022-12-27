import java.util.Scanner;

public class Paliondrome {

	public static void main(String[] args) {
		String str, another="y";
		int left,right;
		Scanner scan = new Scanner(System.in);
		while(another.equalsIgnoreCase("y")) {
		System.out.println("Enter a string: ");
		str= scan.nextLine();
		left=0;
		right=str.length()-1;
		while(str.charAt(left)==str.charAt(right)&& left<right) {
			left++;
			right--;
			
		}
		if(left<right)
			System.out.println("Not a paliondrome");
		else
			System.out.println("Paliondrome");
		System.out.println("Enter another paliondrome (y/n)");
		another=scan.nextLine();
		
		}
	}

}
