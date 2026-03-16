import java.util.Scanner;

public class task2 { 
	static int balance = 100000;
	    public static void main(String[] args) {
	    	
	    	Scanner sc = new Scanner (System.in);
	    	System.out.println("Enter the amount:");
	    	int amount = sc.nextInt();
	    	sc.close();
	    	
	    	if(amount>balance) {
	    		System.out.println("Insufficent Balance");
	    		
	    	}else if (amount<=0) {
	    		System.out.println("Invalid Amount");
	    		
	    	}else {
	    		int remaining = balance - amount ;
	    		System.out.println("After the withraw balance:"+remaining);
	    	}
	    }
	    	
	
	}