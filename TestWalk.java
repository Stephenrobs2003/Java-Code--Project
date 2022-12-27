import java.util.Scanner;
public class TestWalk
{
    public static void main (String[] args)
    {
    	int maxSteps;   // maximum number of steps in a walk
    	int maxCoord;   // the maximum x and y coordinate
    	int x, y;       // starting x and y coordinates for a walk
    	Scanner scan = new Scanner(System.in);
    	System.out.println ("\nRandom Walk Test Program");
    	System.out.println ();
    	System.out.print ("Enter the maximum number of steps: ");
    	maxSteps = scan.nextInt();
    	System.out.print ("Enter the boundary for the square: "); 
    	maxCoord = scan.nextInt();
    	System.out.print ("Enter the starting x and y coordinates with a space between: ");
    		x = scan.nextInt();
    		y = scan.nextInt();    	
    	RandomWalk person1 = new RandomWalk(10, 5, 0, 0);
    	RandomWalk person2 = new RandomWalk(maxSteps, maxCoord, y, x);
    	System.out.println(person1);
    	System.out.println(person2);
    	
    	for(int i = 0; i < 5; i++) {//for loop to test takeStep()
    		person1.takeStep();
    		System.out.println("Person 1: " + person1); //printing each step
    		System.out.println();
    		person2.takeStep();
    		System.out.println("Person 2: " + person2); //printing each step
    		System.out.println();
    	}
    	
    	RandomWalk person3 = new RandomWalk(200, 10, 0, 0);
    		person3.walk(); //test the walk method
    		System.out.println("Person 3: " + person3);
    		System.out.println();
    	
    	RandomWalk person4 = new RandomWalk(200, 10, 0, 0);
    	
    	for (int i = 0; i <= 5; i++) {//for loop to test max distance
        	System.out.println(person4);
    		person4.takeStep();
    		person4.getMaxDistance();
    		System.out.println("Max Distance: " + person4.getMaxDistance());
    		System.out.println();
    		}
    	scan.close();
    }
}