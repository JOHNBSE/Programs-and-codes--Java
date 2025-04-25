package first;

public class CheckBalance {
	private int AccNumber;
	private String AccHolder;
	private int Balance;
	
	public static void main(String [] args) {
		CheckBalance obj = new CheckBalance(010654,"John",1000000);
		obj.DepositMoney(100000);
		System.out.println(obj.Balance());
		
	}

CheckBalance(int AccNumber, String AccHolder, int Balance){
	this.AccHolder = AccHolder;
	this.AccNumber = AccNumber;
	this.Balance = Balance;
}

void DepositMoney(int amount) {
	Balance = Balance + amount;
}
int Balance() {
	return Balance;
}
}


