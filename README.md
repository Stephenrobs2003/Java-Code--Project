Loan Calculator Code Description:

LoanSimulator should contain one main method that drive the entire simulation. There should be very little branching code in main. It should just call methods
It should contain UserInput method.  This method should be responsible for gathering and verifying the user's inputs. If the user enters an invalid value, they should be prompted to re-enter the information until they enter a valid value. The user should be prompted for the following information:
Loan amount: The amount should not be less than 0
Annual Interest Rate : The value should be an Integer instead of double
Loan Period
A runSimulation method. This method is responsible for calculating monthlypayment and totalPayment. The annual interest rate should be randomized using the value prompted. The randomized value should not be Zero.
At last you have printResult method. It should display all the original values entered. Also the values for monthlypayment and totalpayment. Make sure to use DecimalFormat to format monthlypayment and totalpayment.
