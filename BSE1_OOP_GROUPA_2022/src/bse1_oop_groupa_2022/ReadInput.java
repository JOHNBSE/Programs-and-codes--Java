package bse1_oop_groupa_2022;
import java.io.*;
public class ReadInput {

	public static void main(String[] args) throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(in);
		System.out.println("Enter your name: ");
		String nam = buf.readLine();
		System.out.println("Welcome to the world " + nam);
		System.out.println("Enter your mother's name: ");
		String name = buf.readLine();
		System.out.println("My Mother's name is "+name);

	}

}
