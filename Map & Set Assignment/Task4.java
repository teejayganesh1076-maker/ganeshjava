import java.util.*;

public class Task4{
    // Map to store employee ID → salary
    private Map<Integer, Double> salaryMap = new HashMap<>();

    // Add employee
    public void addEmployee(int id, double salary) {
        salaryMap.put(id, salary);
    }

    // Retrieve salary by ID
    public void getSalary(int id) {
        if (salaryMap.containsKey(id)) {
            System.out.println("Salary of Employee " + id + " = " + salaryMap.get(id));
        } else {
            System.out.println("Employee ID " + id + " not found!");
        }
    }

    // Update salary by ID
    public void updateSalary(int id, double newSalary) {
        if (salaryMap.containsKey(id)) {
            salaryMap.put(id, newSalary);
            System.out.println("Updated salary of Employee " + id + " = " + newSalary);
        } else {
            System.out.println("Cannot update. Employee ID " + id + " not found!");
        }
    }

    public static void main(String[] args) {
        Task4 system = new Task4();

        // Add employees
        system.addEmployee(101, 50000);
        system.addEmployee(102, 60000);
        system.addEmployee(103, 45000);

        // Retrieve salaries
        system.getSalary(101);   // Found
        system.getSalary(104);   // Missing ID

        // Update salary
        system.updateSalary(102, 65000); // Update success
        system.updateSalary(105, 70000); // Missing ID
    }
}
