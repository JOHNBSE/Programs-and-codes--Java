package myproject;
import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int password;
		do {
			System.out.println("enter password");
			password = input.nextInt();
		}while (password != 8819 );

	}

}
