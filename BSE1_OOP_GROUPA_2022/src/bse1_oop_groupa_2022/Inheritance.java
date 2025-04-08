package bse1_oop_groupa_2022;

public class Inheritance {
	public static void main(String [] args) {
		Animal animal = new Animal();
		//animal.eat();
		//animal.roam();
		
		//call methods through inheritance
		Lion lion = new Lion();
		//lion.sleep();
		lion.eat();
		//lion.roam();
		
		Hippo hippo = new Hippo();
		hippo.swim();
		
		cat meow = new cat();
		meow.sleep();
	}


	}

class Animal{
	public void eat() {
		System.out.println("Animal Eat");
		
	}
	public void roam() {
		System.out.println("Animal roam");
		
	}
}
class Lion extends Animal{
	void sleep() {
		System.out.println("Lion sleep");
	}
	public void eat() {
		System.out.println("Lion Eat");
	}
}
class Hippo extends Animal{
	void swim() {
		System.out.println("Animal swim");
	}
}
class cat extends Lion{
		
	}
