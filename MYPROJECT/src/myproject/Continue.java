package myproject;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x = 10; x<=40; x += 10) {
			if(x == 30) {
				continue;  //skips 30 and goes for the next iteration
			}System.out.println(x);
		}

	}

}
