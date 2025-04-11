package learn;
import java.io.*;

public class Input {

	public static void main(String[] args) throws IOException {
		String nam;
		// TODO Auto-generated method stub
		//InputStreamReader in = new InputStreamReader(System.in);
		//BufferedReader buf = new BufferedReader(in);
		
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Please Enter your name:");
		
		nam = buf.readLine();
		System.out.println("Welcome to Java programming Mr."+nam);
		
	}

}
