package learn2;

public class Shirt {
	public static String color;
	public static char size;
	
	public void puton() {
		System.out.println("shirt is on!");
	}
	public void putoff() {
		System.out.println("shirt is off!");
	}
	//constructor
	Shirt(){
		System.out.println("inside constructor!");
	}
	Shirt(String color, char size){
		this.color = color;
		this.size = size;
		
	}

}
