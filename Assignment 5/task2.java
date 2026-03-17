import java.util.Scanner;

public class task2 { 
	 static class BankAccount{
		 int AccountNumber;
		 String AccountHolderName;
		 int Balance = 10000;
		 int amount;
	 void deposit() {
		 int deposit = Balance + amount;
		 System.out.println("The balance of "+AccountHolderName+ ", after the deposit is: "+deposit);
	 }
	 void Balance() {
		 int balance ;	 
	 } 
	 void withdraw() {
		 int withdraw = amount;
		 Balance =  Balance - withdraw ;
		 System.out.println("The remaining balance of "+AccountHolderName+ " is after withdraw: "+Balance);	 
	 }
	 }
	    public static void main(String[] args) {
	    	
	    	BankAccount result = new BankAccount();
	    	result.AccountNumber = 20;
	    	result.AccountHolderName = "Ganesh";
	    	result.amount = 2000;
	    	result.deposit();
	    	
	    	BankAccount result1 = new BankAccount();
	    	result1.AccountNumber = 22;
	    	result1.AccountHolderName = "Meens";
	    	result1.amount = 3500;
	    	result1.withdraw();  	
    }
	
	}