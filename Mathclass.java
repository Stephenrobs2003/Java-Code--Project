import java.util.Scanner;

public class Mathclass {
	static float x1;
	static float x2;

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a,b,c");
		int a = scan.nextInt();
		int b =scan.nextInt();
		int c=scan.nextInt();
		if (b*2 < 4*a*c){
			System.err.println("Please enter s valid number");
		
	
		}
		else {
			float discriminate= (float)(Math.pow(b,2)-4*a*c);
			x1 = (float)(b+Math.sqrt(discriminate)/2*a);
			x2 = (float)(b+Math.sqrt(discriminate)/2*a);}
			System.out.println(x1);
			System.out.println(x2);
				
		}
		
	
		
		
		
		// TODO Auto-generated method stub

	}


