package learn;
import java.io.*;

public class Title {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a name: ");
		
		name =buff.readLine();
		
		if(name.equals("Amy") || name.equals("Buffy") || name.equals("Cathy")) {
			System.out.println("Ms."+name);
		}
		else if (name.equals("Elroy") || name.equals("Fred") || name.equals("Graham")) {
			System.out.println("Mr."+name);
		}
		else {
			System.out.println(name);
		}

	}

}
