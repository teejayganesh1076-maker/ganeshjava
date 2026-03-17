

import java.util.Scanner;
public class task1 {
	
	static class Employee{
		int empID;
		String empName;
		double basicSalary;
		
	void calculate() {
		double HRA = basicSalary*0.20;
		double DA = basicSalary*0.10;
		double bonus = basicSalary*0.05;
		double GrossSalary;
		if(basicSalary > 50000) {
		GrossSalary = basicSalary + HRA +DA+ bonus;
		}
		else  {
			 GrossSalary = basicSalary + HRA +DA;
			}
			System.out.println("the toatl gross salary of " +empName+ " is: "+GrossSalary);		
	}
	}
	   public static void main(String[] args) {
		   
		   Employee obj = new Employee();
		   obj.empID = 101;
		   obj.empName = "Ganesh";
		   obj.basicSalary = 10000;
		   obj.calculate();    
		   
		   Employee obj1 = new Employee();
		   obj1.empID = 102;
		   obj1.empName = "Fayaz";
		   obj1.basicSalary = 70000;
		   obj1.calculate(); 
		   
		   Employee obj2 = new Employee();
		   obj2.empID = 103;
		   obj2.empName = "sakthi";
		   obj2.basicSalary = 55000;
		   obj2.calculate(); 
	   }
	}


