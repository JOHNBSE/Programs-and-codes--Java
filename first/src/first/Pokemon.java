package first;

public class Pokemon{
	int level;
	String name;
	
	Pokemon(){
		level = 1;
	}
	
	Pokemon(String name, int level){
		this.name = name;
		this.level = level;
	}
	
	void attack() {
		System.out.println(name+ " attacks at level "+level);
	}
	
	}

