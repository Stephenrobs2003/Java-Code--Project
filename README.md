Loan Calculator Code Description:

LoanSimulator should contain one main method that drive the entire simulation. There should be very little branching code in main. It should just call methods
It should contain UserInput method.  This method should be responsible for gathering and verifying the user's inputs. If the user enters an invalid value, they should be prompted to re-enter the information until they enter a valid value. The user should be prompted for the following information:
Loan amount: The amount should not be less than 0
Annual Interest Rate : The value should be an Integer instead of double
Loan Period
A runSimulation method. This method is responsible for calculating monthlypayment and totalPayment. The annual interest rate should be randomized using the value prompted. The randomized value should not be Zero.
At last you have printResult method. It should display all the original values entered. Also the values for monthlypayment and totalpayment. Make sure to use DecimalFormat to format monthlypayment and totalpayment.


Lottery Java Code Description:

Getting a single-occupancy room in a dormitory is very tough because of the high demand. There is one especially large and comfortable single occupancy room in your dorm that everybody covets. The housing office runs a lottery at the beginning of a quarter. Students must submit their entries before the lottery. The result of the lottery will consist of three cards. The numbers on the cards range from 10 to 15 and the color of the card can be red, green, or black. 

Write a program to create winning combination of lottery card. Use two classes  LotteryCard and RoomWinner. RoomWinner will be the driver class.

Reversing an Array:

Write a program that prompts the user for an integer, then asks the user to enter that many values. Store these values in an array and print the array. Then reverse the array elements so that the first element becomes the last element, the second element becomes the second to last element, and so on, with the old last element now first. Do not just reverse the order in which they are printed; actually, change the way they are stored in the array. Do not create a second array; just rearrange the elements within the array you have. (Hint: Swap elements that need to change places.) When the elements have been reversed, print the array again. 

After printing the array in reverse order. Create another array that holds the array sort in ascending order.

Random Walk:

The RandomWalk class will have the following instance data (all type int):
• the x coordinate of the current position
• the y coordinate of the current position
• the maximum number of steps in the walk
• the number of steps taken so far in the walk
• the boundary of the square (a positive integer -- the x and y coordinates of the position can vary between plus and minus this value)  

Create a new file RandomWalk.java. You’ll define the RandomWalk class incrementally testing each part as you go.
1. First declare the instance data (as described above) and add the following two constructors and toString method.

          RandomWalk (int max, int edge) - Initializes the RandomWalk object. The maximum number of steps and the boundary are given by the parameters. The x and y coordinates and the number of steps taken should be set to 0.

          RandomWalk (int max, int edge, int startX, int startY) -- Initializes the maximum number of steps, the boundary, and the starting position to those given by the parameters.
          String toString() -- returns a String containing the number of steps taken so far and the current position -- The string should look something like  this: Steps: 12; Position: (-3,5) 

2. Compile what you have so far then open the file TestWalk.java. This file will be used to test your RandomWalk methods. So far it prompts the user to enter a boundary, a maximum number of steps, and the x and y coordinates of a position. Add the following: 

        Declare and instantiate two RandomWalk objects -- one with boundary 5, maximum steps 10, and centered at the origin (use the two-parameter constructor) and the other with the values entered by the user. Print out each object. Note that you won’t get any information about the boundary or maximum number of steps (think about what your toString method does), but that’s ok.  

 Compile and run the program to make sure everything is correct so far.

3. Next add the following method to the RandomWalk class: void takeStep(). This method simulates taking a single step either up, down, left, or right. To “take a step” generate a random number with 4 values (say 0, 1,2, 3) then use a switch statement to change the position (one random value will represent going right, one left, and so on). Your method should also increment the number of steps taken. 

4. Add a for loop to TestWalk.java to have each of your RandomWalk objects take 5 steps. Print out each object after each step so you can see what is going on. Compile and run the program to make sure it is correct so far. 

5. Now add to RandomWalk.java the following two methods. Each should be a single return statement that returns the value of a boolean expression. 

                boolean moreSteps() - returns true if the number of steps taken is less than the maximum number; returns false otherwise 

                boolean inBounds() - returns true if the current position is on the square (include the boundary as part of the square); returns false otherwise. 

6. Add to the RandomWalk class a method named walk that has no parameters and returns nothing. Its job is to simulate a complete random walk.     That is, it should generate a sequence of steps as long the maximum number of steps has not been taken and it is still in bounds (inside the square).This should be a very simple loop (while or do...while) --- you will need to call the methods takeStep, moreSteps, and inBounds. 

 7.  Add to TestWalk.java a statement to instantiate a RandomWalk object with a boundary of 10 and 200 as the maximum number of steps. (You may want to comment out most of the code currently in TestWalk -- especially the user input and the loop that takes five steps -- as the walk method will be easier to test on its own. The /* ... */ style of comment is useful for this. But don’t delete that other code, as you’ll need it later in        the lab.) Then add a statement to have the object walk. Print the object after the walk. Compile and run the program. Run it more than once --          you should be able to tell by the value printed whether the object went out of bounds or whether it stopped because it reached the maximum number of steps. 

8.Now write a client program in a file named DrunkenWalk.java. The program should simulate a drunk staggering randomly on some sort of platform (imagine a square dock in the middle of a lake). The goal of the program is to have the program simulate the walk many times (because of randomness each walk is different) and count the number of times the drunk falls off the platform (goes out of bounds). Your program should read in the boundary, the maximum number of steps, and the number of drunks to simulate. It should then have a loop (a for loop would be a good idea) that on each iteration instantiates a new RandomWalk object to represent a drunk, has the object walk, then determines whether or not the drunk fell off the platform (and updates a counter if it did). After the loop print out the number of times the drunk fell off. Compile and run your program. To see the “randomness” you should run it several times. Try input of 10 for the boundary and 200 for the number of steps first (sometimes the drunk falls off, sometimes not); try 10 for the boundary and 500 for the steps (you should see different behavior); try 50 for the boundary and 200 for the steps (again different behavior). 

9. Now write a second client program in a file named Collisions.java. This program should simulate two particles moving in space. Its goal is to determine the number of times the two particles collide (occupy exactly the same position after the same number of steps -- the steps could be thought of as simulating time). We’ll assume the particles are in a very large space so use a large number for the boundary (such as 2,000,000). Use 100,000 for the maximum number of steps. (Don’t enter the commas.) Start one particle at (-3, 0) and the other at (3, 0). (You can hardcode these values into the program; no need to enter them.) Your program should contain a loop that has each particle take a step as long as the particles have not exceeded the maximum number of steps. The program then determines how often the particles have collided. Note that in order for your program to know whether or not the two different RandomWalk objects are in the same place it needs to be able to find out the position. Hence, you need to add the following two methods to the RandomWalk class. 

                          int getX() - returns the x coordinate of the current position
                          int getY() - returns the y coordinate of the current position 

Compile and run your program to make sure it works. As before run it several times. 

10. In your Collisions.java program the condition to determine if the points are at the same position is a bit cumbersome. This is something that would be best put in a separate method. Add a static method to Collisions.java (after the main method) with signature public static boolean same Position (RandomWalk p 1, RandomWalk p2).The method should return true if p1 and p2 are at the same position and return false otherwise. Modify your main method so it calls same Position rather than directly testing to see if the objects are at the same position. Test the program. 

11. In using random walks to simulate behavior it is often of interest to know how far away from the origin the object gets as it moves.

a. Add an instance variable maxDistance (type int) to the RandomWalk class. This should be set to 0 in each constructor.
b. Now the takeStep method needs to update this maximum when a step is taken. We’ll add a support method to the class to do this. Add a private method named max that takes two integer parameters (say x and y) and returns the largest of the two.

c. Add code to takeStep to update maxDistance. This can be done in a single statement using the max method -- the new value of maxDistance should be the maximum of 1) the old value of maxDistance, and 2) the current distance to the origin. Note that if the current point is (-3, 15) the distance to the origin is 15; if the current point is (-10, 7) the distance to the origin is 10. Remember that Math.abs returns the absolute value of a number.

d. Finally add an accessor method to return that distance so a client program can access it: public int getMaxDistance()
e. Test the maximum by adding statements in TestWalk.java to get and print the maximum distance for each of the objects after the loop that had them take and print out 5 steps (this way you can see if the maximum is correct - each step is printed). 
