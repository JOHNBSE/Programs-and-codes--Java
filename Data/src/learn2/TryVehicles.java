<<<<<<< HEAD
package learn2;

public class TryVehicles {

	public static void main(String[] args) {
		Bike b = new Splendor();
		b.run();
		
		Bike b1 = new trycycle();
		b1.run();

	}

}
class Bike{
	void run() {
		System.out.println("running");
	}
}
class Splendor extends Bike{
	void run() {
		System.out.println("runnin safely wit 60km");
	}
}
class trycycle extends Bike{
	void run() {
		System.out.println("ridden");
	}
}
=======
package learn2;

public class TryVehicles {

	public static void main(String[] args) {
		Bike b = new Splendor();
		b.run();
		
		Bike b1 = new trycycle();
		b1.run();

	}

}
class Bike{
	void run() {
		System.out.println("running");
	}
}
class Splendor extends Bike{
	void run() {
		System.out.println("runnin safely wit 60km");
	}
}
class trycycle extends Bike{
	void run() {
		System.out.println("ridden");
	}
}
>>>>>>> 2d984131f8fe9a0d2c2a1444e0b22ee4750fa0c0
