<<<<<<< HEAD
package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner{
	
	public static void main(String [] args) {
		
		List<Laptops> lap = new ArrayList<>();
		lap.add(new Laptops("hp", 16, 12000));
		lap.add(new Laptops("apple", 32, 10000));
		lap.add(new Laptops("dell", 8, 32000));
		lap.add(new Laptops("Lenovo", 64, 15000));
		
		Collections.sort(lap);
		
		for(Laptops l : lap ) {
			System.out.println(l);
		}
	}

}
=======
package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner{
	
	public static void main(String [] args) {
		
		List<Laptops> lap = new ArrayList<>();
		lap.add(new Laptops("hp", 16, 12000));
		lap.add(new Laptops("apple", 32, 10000));
		lap.add(new Laptops("dell", 8, 32000));
		lap.add(new Laptops("Lenovo", 64, 15000));
		
		Collections.sort(lap);
		
		for(Laptops l : lap ) {
			System.out.println(l);
		}
	}

}
>>>>>>> 2d984131f8fe9a0d2c2a1444e0b22ee4750fa0c0
