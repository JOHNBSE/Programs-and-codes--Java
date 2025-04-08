package bse1_oop_groupa_2022;

public class LearnInterfaces {
	public static void main(String [] args) {
		BangaloeHouse bhouse = new BangaloeHouse();
		bhouse.openDoor();
		bhouse.sprinklewater();
		
		CottageHouse chouse = new CottageHouse();
		chouse.openDoor();
		chouse.sprinklewater();
		
		HutHouse hhouse = new HutHouse();
		hhouse.openDoor();
		
	}
}

abstract class House{
	abstract void openDoor();

}
class BangaloeHouse extends House implements Bathroom {
	void openDoor() {
		System.out.println("opening bangaloe door");
	}

	@Override
	public void sprinklewater() {
		System.out.println("Bangaloe's water sprinkler");
		
	}
	
}

class HutHouse extends House{
	void openDoor() {
		System.out.println("opening huthouse door");
	}
}
class CottageHouse extends House implements Bathroom{
	void openDoor() {
		System.out.println("opening cottage door");
	}

	@Override
	public void sprinklewater() {
		System.out.println("Cottage's water sprinkler");
		
	}
	
}
interface Bathroom{
	public final double size = 10.5;
	public void sprinklewater();
}