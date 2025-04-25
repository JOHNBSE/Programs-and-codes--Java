<<<<<<< HEAD
package first;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insect objinsect = new insect(14);
		System.out.println(objinsect.leges);
		
		objinsect.fly();
		System.out.println(objinsect.legs(5));
		
		tiger objtiger = new tiger();
		objtiger.eat();
		System.out.println(objtiger.food("meat"));
		
		

}
}	
class insect{
	int leges;
	void fly() {
		System.out.println("Insect fly");
	}
	
	public int legs(int legs) {
		return legs;
	}
	//constructor
	public insect(int legs) {
		leges = legs;
	}
	
}

class tiger{
	void eat() {
		System.out.println("tiger bites");
	}
	public String food(String food) {
		return food;
	}
}

	
=======
package first;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insect objinsect = new insect(14);
		System.out.println(objinsect.leges);
		
		objinsect.fly();
		System.out.println(objinsect.legs(5));
		
		tiger objtiger = new tiger();
		objtiger.eat();
		System.out.println(objtiger.food("meat"));
		
		

}
}	
class insect{
	int leges;
	void fly() {
		System.out.println("Insect fly");
	}
	
	public int legs(int legs) {
		return legs;
	}
	//constructor
	public insect(int legs) {
		leges = legs;
	}
	
}

class tiger{
	void eat() {
		System.out.println("tiger bites");
	}
	public String food(String food) {
		return food;
	}
}

	
>>>>>>> 2d984131f8fe9a0d2c2a1444e0b22ee4750fa0c0
