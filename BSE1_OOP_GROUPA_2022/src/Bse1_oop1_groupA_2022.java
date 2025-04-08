
public class Bse1_oop1_groupA_2022 {

	public static void main(String[] args) {
		System.out.println("Welcome to the world");
		int x, y, sum, prdt;
		x = 2;
		y = 3;
		sum = x + y;
		prdt = x * y;
		System.out.println("the sum of "+ x +" and " + y + " is " +sum);
		System.out.println("the product of "+ x +" and " + y + " is " +prdt);
		
		for(int i = 0; i<= 10; i++) {
			if(i%2 == 1) 
			System.out.print(i + ",");
		
	}
		// create an object
		Bse1_oop1_groupA_2022 obj = new Bse1_oop1_groupA_2022();
		obj.sumxy();
		obj.myName();
		
		Person obj2 = new Person();
		obj2.speak();

}
	void sumxy() {
		int x, y, sum;
		x = 3;
		y = 4;
		sum = x + y;
		System.out.println("sum by a methos is" +sum);
	}
	void myName() {
		System.out.println("JOHN WYCLIFFE");
	}
	
}
 class Person{
	 void speak() {
		 System.out.println("Person speaking");
	 }
 }
