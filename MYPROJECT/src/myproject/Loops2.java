package myproject;
import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int factorial = 1;
		while (num > 1) {
			factorial *= num--;
			System.out.println(factorial);
		}

	}

}
