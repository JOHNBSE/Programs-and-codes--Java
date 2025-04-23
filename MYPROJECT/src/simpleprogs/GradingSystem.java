package simpleprogs;
import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int mark;
		char Grade;
		mark = input.nextInt();
		
		if(mark <= 100 && mark >= 0) {
			if (mark >= 90) {
				Grade = 'A';
			}else if(mark >= 75) {
				Grade = 'B';
			}else if (mark >= 65) {
				Grade = 'C';
			}else if (mark >= 55) {
				Grade = 'D';
			}else if (mark >= 40) {
				Grade = 'E';
			}else{
				Grade = 'F';
			}System.out.println("Grade : " + Grade);
		}else {
			System.out.println("Mark Out of Range");
		}

	}

}
