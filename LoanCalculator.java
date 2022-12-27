import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class LoanCalculator {
	double loanamount;
	int AnnualInterestRate;
	int LoanPeriod;
	float monthlyInterestRate;
	int numberofpayments;
	double monthlypayment;
	double CompoundedValue;
	double Value;
	double count;
	double FinalValue;
	int RandomAnnualInterestRate;

	
	public void UserInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the loan amount greater than 0: ");
		loanamount = scan.nextDouble();
		while (loanamount <= 0) {
			System.out.println("Enter a valid input");
			loanamount = scan.nextDouble();
		}
			System.out.println("Enter the annual Interst Rate");
			AnnualInterestRate= scan.nextInt();
			System.out.println("Enter the Loan Period in years");
			LoanPeriod =scan.nextInt();	
		}

	
	public void runSimulation() {
		Random rand = new Random();
		RandomAnnualInterestRate = rand.nextInt(AnnualInterestRate)+1;
		monthlyInterestRate =(float)RandomAnnualInterestRate/1200;
		numberofpayments = LoanPeriod * 12;
		CompoundedValue= 1 + monthlyInterestRate;
		monthlypayment =(loanamount * monthlyInterestRate);
		double Y =monthlypayment/(1-Math.pow((1-(1/(1+monthlyInterestRate))),numberofpayments));
		FinalValue = Y * numberofpayments;
		
	}
	
	public void printResult() {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Calculated loan amount is: " + "$"+ loanamount);
		System.out.println("Annual interest rate is: " + "$"+ RandomAnnualInterestRate);
		System.out.println("Monthly payment is: "+ "$" + df.format(monthlypayment));
		System.out.println("Final value that needs to be paid is: " + "$"+df.format(FinalValue));
	}
	public static void main(String[] args) {
		
		LoanCalculator lc = new LoanCalculator();
		lc.UserInput();
		lc.runSimulation();
		lc.printResult();
		
		// TODO Auto-generated method stub */
		

	}

}	

