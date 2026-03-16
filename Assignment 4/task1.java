import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println( "Enter the Num :");

	int number = sc.nextInt();
	int count =0;
	
	 if (number==0) {
		 System.out.println(1);
		 
	 }
	 while(number>0) {
		 count++;
		 number/=10;
			sc.close();
	 }
	 System.out.println("the num is digital:"+count);
	}

}