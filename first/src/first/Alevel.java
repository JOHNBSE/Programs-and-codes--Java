<<<<<<< HEAD
package first;

public class Alevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Olevel obj1 = new Olevel("Certificate");
		obj1.chill();
		System.out.println(obj1.level(5));
		System.out.println(obj1.reward());
		
		Primary obj2 = new Primary();
		obj2.streams();
		System.out.println(obj2.pupils("children"));
		
	}

}
class Olevel{
	String reward;
	public int level(int num) {
		return num;
	}
	void chill() {
		System.out.println("in Olevel, there is chill");
	}
	public Olevel(String reward) {
		this.reward = reward;
	}
	public String reward() {
		return reward;
		
	}
}

class Primary{
	public String pupils(String pupils) {
		return pupils;
	}
	void streams() {
		System.out.println("Primary has twon streams");
	}
=======
package first;

public class Alevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Olevel obj1 = new Olevel("Certificate");
		obj1.chill();
		System.out.println(obj1.level(5));
		System.out.println(obj1.reward());
		
		Primary obj2 = new Primary();
		obj2.streams();
		System.out.println(obj2.pupils("children"));
		
	}

}
class Olevel{
	String reward;
	public int level(int num) {
		return num;
	}
	void chill() {
		System.out.println("in Olevel, there is chill");
	}
	public Olevel(String reward) {
		this.reward = reward;
	}
	public String reward() {
		return reward;
		
	}
}

class Primary{
	public String pupils(String pupils) {
		return pupils;
	}
	void streams() {
		System.out.println("Primary has twon streams");
	}
>>>>>>> 2d984131f8fe9a0d2c2a1444e0b22ee4750fa0c0
}