<<<<<<< HEAD
package learn;

import java.util.Date;

public class Salar {
	public static void main(String[] args) {
		Manager man = new Manager();
		man.getname();
		man.setname("john");
		man.bonus();
	}
}
class Employee {
	public int sal;
	public String name;
	
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public Date date;
	public int salaries() {
		int x = 300000;
		return x;
	}
}
class Manager extends Employee {
	private int new_sal;
	public void bonus() {
		this.new_sal = salaries();
		this.new_sal += 300000;
		System.out.println("Salary is : "+ new_sal);
		
		getname();
		//setname();
	}
}
class Executive_Manager extends Employee {
	private int new_sal;
	public void bonus() {
		this.new_sal = salaries();
		this.new_sal += 400000;
		System.out.println("Salary is : "+ new_sal);
	}
}
class Waitress extends Employee {
	void serv(){
		
	}
}
class Secretary extends Employee {
	void date() {
		
	}
=======
package learn;

import java.util.Date;

public class Salar {
	public static void main(String[] args) {
		Manager man = new Manager();
		man.getname();
		man.setname("john");
		man.bonus();
	}
}
class Employee {
	public int sal;
	public String name;
	
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public Date date;
	public int salaries() {
		int x = 300000;
		return x;
	}
}
class Manager extends Employee {
	private int new_sal;
	public void bonus() {
		this.new_sal = salaries();
		this.new_sal += 300000;
		System.out.println("Salary is : "+ new_sal);
		
		getname();
		//setname();
	}
}
class Executive_Manager extends Employee {
	private int new_sal;
	public void bonus() {
		this.new_sal = salaries();
		this.new_sal += 400000;
		System.out.println("Salary is : "+ new_sal);
	}
}
class Waitress extends Employee {
	void serv(){
		
	}
}
class Secretary extends Employee {
	void date() {
		
	}
>>>>>>> 2d984131f8fe9a0d2c2a1444e0b22ee4750fa0c0
}