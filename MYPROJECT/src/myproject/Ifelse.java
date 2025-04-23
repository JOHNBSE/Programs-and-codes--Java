package myproject;
import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if (age < 16) {
			System.out.println("Too young");
		}else {
			System.out.println("Welcome");
		}

	}

}
