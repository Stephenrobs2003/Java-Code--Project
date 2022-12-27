public class Collisions {

	public static void main(String args[]) {
		int x1 = -3;
		int y1 = 0;
		int x2 = 3;
		int y2 = 0;
		int boundary = 2000000;
		int max_steps = 100000;
		int collide = 0;		
		RandomWalk part1 = new RandomWalk(max_steps, boundary, x1, y1);
		RandomWalk part2 = new RandomWalk(max_steps, boundary, x2, y2);
		
		for (int i = 0; i <= max_steps; i++) {
			part1.takeStep();
			part2.takeStep();
			if (samePosition(part1, part2) == true) {
				collide++;
			}
		}
		System.out.println("Particles collided " + collide + " times.");
	}
	public static boolean samePosition (RandomWalk particle1, RandomWalk particle2) {
		if (particle1.getX() == particle2.getX() && particle1.getY() == particle2.getY()) {
			return true;
		}else {
			return false;
		}
	}

}
	

