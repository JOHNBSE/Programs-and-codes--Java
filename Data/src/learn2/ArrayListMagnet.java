package learn2;
import java.util.ArrayList;

public class ArrayListMagnet {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add(0,"Treasure");
		a.add(1,"John");
		a.add(2,"Fetty");
		System.out.println(a);
		
		if(a.contains("John")) {
			a.add("Alvin");
		}
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		System.out.println(a.indexOf("Alvin"));
	}

}
