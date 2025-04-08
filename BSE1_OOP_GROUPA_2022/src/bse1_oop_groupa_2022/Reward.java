package bse1_oop_groupa_2022;

public class Reward {
	static double total;
	static double bonus;
	
	//constructor for girls
	public Reward(double bonus) {
		this.bonus = bonus;
	}
	
	//constructor for boys
	public Reward() {
		this.bonus = 0.0;
		
	}
	double score(double marks) {
		return(bonus + marks);
		
	}
	public static void main(String [] args) {
		
		Reward girl = new Reward(1.5);
		total = girl.score(25.0);
		System.out.println("girls get " +total);
		
		Reward boy = new Reward();
		total = boy.score(25.0);
		System.out.println("boys get "+total);
		
		
}



	
	
}
