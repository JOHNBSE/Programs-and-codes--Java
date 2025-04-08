package bse1_oop_groupa_2022;

public class TestClass {
	static double bonus;
	static double totalpoints;
	// constructor for galz
	public TestClass(double bonus) {
		this.bonus = bonus;
	}
	
	// constructor for boys
	public TestClass() {
		this.bonus = 0.0;
	}
	
	double score(double marks) {
		return(bonus + marks);
	}
	
	public static void main(String[] args){
		TestClass objgal = new TestClass(1.5);
		totalpoints = objgal.score(24.0);
		System.out.println(totalpoints);
		
		TestClass objboy = new TestClass();
		totalpoints = objgal.score(24.0);
		System.out.println(totalpoints);


	}

}
