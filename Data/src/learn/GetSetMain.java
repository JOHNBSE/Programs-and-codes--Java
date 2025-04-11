package learn;

public class GetSetMain {
	public static void main(String [] args ) {
		GetSet obj = new GetSet();
		obj.setage(21);
		obj.setfavColor("black");
		obj.setname("John");
		
		int age = obj.getage();
		String color = obj.getfavColor();
		String name = obj.getname();
		
		System.out.println("my name is "+name+" i am "+age+" years old, and my favorite color is "+color);
	}

}
