package learn2;

public class Doctor {
	boolean WorksatHospital;
	void treatPatient() {
		System.out.println("Doctor performs a check up");
	}

}
class FamilyDoctor extends Doctor{
	boolean MakesHouseCalls;
	void giveAdvice() {
		System.out.println("Doctor gives homespun adavice");
	}
	
}
class Surgeon extends Doctor{
	void treatPatient() {
		System.out.println("Perform surgery");
	}
	void MakeIncision() {
		System.out.println("Make incision!");
	}
}
