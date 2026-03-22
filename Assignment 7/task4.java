tapackage javaproj;


public class BankAccount {
	int accountNumber;
	String accountHolderName;
	double balance;
	
	BankAccount(int a, String n, double b){
		this.accountNumber= a;
		this.accountHolderName = n;
		this.balance = b;
	}
	void deposit(double amount) {
		balance = amount + balance;
	}
	
	void displayBalance() {
		
		System.out.println("The Remaining balance is: "+balance);
		
	}
	

	public static void main(String[] args) {
		BankAccount bk = new BankAccount(001, "Ganesh selvam", 2000);
		bk.deposit(48000);
		System.out.print("The accountId : "+bk.accountNumber+" of Mr/Mrs."+bk.accountHolderName+" , Balance amount is: ");
		bk.displayBalance();
		
		BankAccount bk1 = new BankAccount(002, "Praveen Rajendiran", 6000);
		bk1.deposit(500000);
		System.out.print("The accountId : "+bk1.accountNumber+" of Mr/Mrs."+bk1.accountHolderName+" , Balance amount is: ");
		bk1.displayBalance();
		

	}

}
