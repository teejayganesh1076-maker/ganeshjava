class Employee{
void calculateBonus(){
System.out.println("Bonus calculation");
}
}
class Manager extends Employee{
    void calculateBonus(){
    System.out.println("Manager gets 30% bonus");

    }
}
class Developer extends Employee{
 void calculateBonus(){
System.out.println("Developer gets 20% bonus");

 }
}
class Intern extends Employee{
void calculateBonus(){
System.out.println("Intern gets 5% bonus");

}
}

public class task3 {
    public static void main(String[] args) {
    Employee e1 = new Manager();
    e1.calculateBonus();
    e1 = new Developer();
    e1.calculateBonus();
    e1 = new Intern();
    e1.calculateBonus();       
    }
    
}