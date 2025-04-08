package bse1_oop_groupa_2022;
import java.io.*;
public class IntsParse {

	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(in);
		int x, y, sum;
		
		System.out.println("Enter integer x: ");
		String nam = buf.readLine();
		x = Integer.parseInt(nam);
		System.out.println("value of x is "+x );
		
		System.out.println("Enter integer y: ");
		nam = buf.readLine();
		y = Integer.parseInt(nam);
		sum = x + y;
		
		System.out.println("value of x is "+y );
		System.out.println("My sum of "+x+ " and "+y+" is "+sum);

	}

}
