package learn2;

public class Hospital {

	public static void main(String[] args) {
		Doctor obj = new Doctor();
		//obj.treatPatient();
		
		FamilyDoctor obj2 = new FamilyDoctor();
		obj2.giveAdvice();
		obj2.MakesHouseCalls = true;
		
		Surgeon obj3 = new Surgeon();
		obj3.treatPatient();
		obj3.MakeIncision();

	}

}

	
