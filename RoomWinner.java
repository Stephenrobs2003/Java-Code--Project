import java.util.Random;
public class RoomWinner{
	public static void main(String[] args) {
		// Calling out the function that is written above. 	This is a driving function. 
		LotteryCard Lc = new LotteryCard();
		Lc.method1();
	}
		
		// TODO Auto-generated method stub
}
	
class LotteryCard {
	private int newcolor;
	private int newnumber;	public void method1() {
		// This line prints the statement "Winning Card Combinations
		System.out.println("Winning Card Combination:");
		//This print statement prints "1-red,2-green,3-black
		System.out.println("1-red;2-green;3-black");
		//This statement prints a blank line/space.
		System.out.println("");
		//This print statement first line of the table.
		System.out.println(("     ") + "Color" + ("   ")+"Number");
		//This for loop will go through the range of numbers and check if the number entered is in the range.
		for(int i=1;i<4; i++) {
			Random rand = new Random();
			//Randomizing a new number from the range of 10 to 15.
			newnumber = rand.nextInt(15-10+1)+10;
			// Does the same function like the statement above, but for colors.
			newcolor = rand.nextInt(3-1+1)+1;
			// Prints final output of the card number and the color of the card that won the lottery.
			System.out.println("Card" + i +": "+ newcolor+"       " + newnumber);	
		}
				
		}

	}

