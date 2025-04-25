<<<<<<< HEAD
package first;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Names {
	static String namee;
	static int x = 0;

	public static void main(String[] args) throws IOException {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(in);
		
	while(x<2) {
		System.out.println("Enter name");
		namee = buf.readLine();
		System.out.println(namee);
		x++;
	}
}
}


=======
package first;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Names {
	static String namee;
	static int x = 0;

	public static void main(String[] args) throws IOException {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(in);
		
	while(x<2) {
		System.out.println("Enter name");
		namee = buf.readLine();
		System.out.println(namee);
		x++;
	}
}
}


>>>>>>> 2d984131f8fe9a0d2c2a1444e0b22ee4750fa0c0
