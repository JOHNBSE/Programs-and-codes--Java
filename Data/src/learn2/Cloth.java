package learn2;

public class Cloth {

	public static void main(String[] args) {

		Shirt obj = new Shirt("White",'M');
		obj.puton();
		obj.putoff();
		
		System.out.println(obj.color);
		System.out.println(obj.size);

	}

}
