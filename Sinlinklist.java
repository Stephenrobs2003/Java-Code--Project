import java.util.ArrayList;
import java.util.LinkedList;
public class Sinlinklist {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<>();
		list.add("Jerry");
		list.add("Bingo");
		list.add("Harry");
	System.out.println(list.get(2));
	list.add(1,"John");
	System.out.println(list);
	
	ArrayList<String>listarray = new ArrayList<>();
	listarray.add("Jerry");
	listarray.add("Bingo");
	listarray.add("Harry");
	list.add(1,"John");
	//System.out.println(listarray);
	listarray.add(1,"John");
	System.out.println(listarray);
	System.out.println(listarray.get(2));

	}
	
	
	
	

}
