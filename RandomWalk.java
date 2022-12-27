import java.util.*;

public class RandomWalk {	int x_cord = 0;
	int y_cord = 0;
	int num_steps = 0;
	int max_steps;
	int boundary;
	int maxDistance;
	
	public RandomWalk(int max, int edge, int startY, int startX) {
		max_steps = max;
		boundary = edge;
		y_cord = startY;
		x_cord = startX;
		maxDistance = 0;
	}
	
	void takeStep() {
		int move;
		Random rand = new Random();
		move = rand.nextInt(4);
		maxDistance = max(x_cord, y_cord);
		
		switch (move) {
		case 0:
			x_cord++;
			num_steps++;
			break;
		case 1:
			x_cord--;
			num_steps++;
			break;
		case 2:
			y_cord++;
			num_steps++;
			break;
		case 3:
			y_cord--;
			num_steps++;
			break;
		}
	}
	
	boolean moreSteps() {
		if (num_steps < max_steps) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean inBounds() {
		if (num_steps > max_steps) {
			return false;
		}
		if (boundary >= 0) {
			if (x_cord > boundary || y_cord > boundary) {
				return false;
			}else if (x_cord < -(boundary) || y_cord < -(boundary)) {
				return false;
			}else {
				return true;
			}
			
		}else {
			if (x_cord < boundary || y_cord < boundary) {
				return false;
			}else if (x_cord > -(boundary) || y_cord > -(boundary)) {
				return false;
			}else {
				return true;
			}
		}
		
	}
	
	void walk() {
		while (num_steps != max_steps) {
			if (inBounds() == false) {
				break;
			}
			else if (moreSteps() == false) {
				break;
			}
			else {
				takeStep();
			}
		}
	}
	
	public int getX(){
		//return the x cord of the current position
		return x_cord;
	}
	
	public int getY() {
		//return the y cord of the current position
		return y_cord;
	}
	
	private int max(int x, int y) {
		//finding the max distance from the origin
		if (Math.abs(x) > Math.abs(y)) {
			return Math.abs(x);
		}else {
			return Math.abs(y);
		}
	}
	
	public int getMaxDistance() {
		//returning the max distance at the current position
		return maxDistance;
	}
	
	public String toString() {
		return ("Steps: " + num_steps + ", Position: (" + x_cord + ", " + y_cord + ")");
	}
}
