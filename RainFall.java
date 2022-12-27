import java.util.Scanner;

public class RainFall {

	public static void main(String[] args) {
		double[]rainfall = new double[12];
		/*String[]monthName = new String[12];
		monthName[0]="January";
		monthName[1]= "Febuary";
		monthName[2] = "March";
		monthName[3] = "April";*/
		String monthName[] = {"January, Febuary, March,April, May, June, July, August,September, October"};
		double sum = 0.0;
		double averagerain;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<rainfall.length;i++) {
			System.out.println("RainFall for month " + (i+1) + " :");
			rainfall[i] =scan.nextDouble();
			sum = sum + rainfall[i];
			
		}
		for(int i = 0;i<monthName.length;i++) {
			boolean a = i%2==0;
			System.out.println(a);
						
			
		
			
			
			
			
		}
		averagerain = sum/12.0;
		System.out.println("Annual Average rain " + averagerain);
		

	}

}
