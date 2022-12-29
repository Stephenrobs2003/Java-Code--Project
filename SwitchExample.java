enum PLANET{MERCURY, VENUS, MARS, EARTH, SATURN, NEPTUNE, URANUS, JUPITAR}
public class SwitchExample {

	public static void main(String[] args) {
		PLANET myplanet= PLANET.EARTH;
		canileavehere(myplanet);
	}
	public static void canileavehere(PLANET myplanet) {
		switch(myplanet) {
		case EARTH:
			System.out.println("You can leave here");
			break;
			default:
				System.out.println("Nope");
				
		}
		
		char grade='a';
		switch(grade) {
		case 'a':
			System.out.println("Excellent");
			break;
		case 'b':
			System.out.println("Good");
			break;
		case 'c':
			System.out.println("Passed");
			break;
		default:
			System.out.println("try again");	
		}
		
		// TODO Auto-generated method stub

	}

}
