import java.io.*;
import java.util.*;

class Payment{
	public void processPayment(){
		System.out.println("Processing Payment...");
	}
}
class CreditCardPayment extends Payment{
	public void processPayment(){
		System.out.println("Processing Payment through Credit Card...");
	}

}
class DebitCardPayment extends Payment{
	public void processPayment(){
		System.out.println("Processing Payment through Debit Card...");
	}

}
class UPIPayment extends Payment{
	public void processPayment(){
		System.out.println("Processing Payment through UPI...");
	}

}




public class Main{
	public static void main(String[] args){
		Payment obj;
		obj=new CreditCardPayment();
		obj.processPayment();
		obj=new DebitCardPayment();
		obj.processPayment();
		obj=new UPIPayment();
		obj.processPayment();


	}
}