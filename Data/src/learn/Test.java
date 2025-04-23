package learn;

public class Test {

	public static void main(String[] args) {
		int x,y,sum;
		Person obj = new Person();
		obj.speak();
		
		sum = obj.sumxy(5, 7);
		System.out.println(sum);
		
		Animal obj2 = new Animal();
		obj2.speak();
		obj2.walk();
		
		Animal l1 = new Animal(2);
		int legs = l1.leges();
		System.out.println("cows have "+legs+" legs");
		
		Animal l2 = new Animal();
		legs = l2.leges();
		System.out.println("man has "+legs+" legs");

	}
	
}
class Person{
	void speak() {
		System.out.println("Person speaks");
	}
	public int sumxy(int x, int y) {
		return (x + y);
		
	}

}
class Animal {
	int legs;
	void speak() {
		System.out.println("Animal speaks");
		
	}
	void walk() {
		System.out.println("animal walks");
	}
	// constructor for 4 legged animals
	public Animal(int legs) {
		this.legs = legs;
	}
	//constructor for 2 legged animals
	public Animal() {
		legs = 0;
	}
	public int leges() {
		return (legs + 2);
	}

}