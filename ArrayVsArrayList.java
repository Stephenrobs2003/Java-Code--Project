import java.util.ArrayList;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		// Array
		// 5 talks about the size of the array
		String[] friends = new String[5];
		friends[0] = "Ben";
		friends[1] = "Quintin";
		friends[2] = "Chim";
		friends[3] = "Bifuh";
		friends[4] = "Tang";
		for(int i=0; i<5;i++) {
			System.out.println(friends[i]);
			
		}
		//ArrayList
		ArrayList<String>friendlist = new ArrayList<>();
		friendlist.add("Taylor");
		friendlist.add("Isaiah");
		friendlist.add("Howard");
		friendlist.add("Colin");
		friendlist.add("Carson");
		friendlist.remove(3);
		for(String name: friendlist) {
			System.out.println("friends" + name);
			
		}
			
	}

}
