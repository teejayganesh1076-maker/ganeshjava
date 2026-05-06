class InvalidMarksException extends Exception {
    public InvalidMarksException(String msg) { super(msg); }
}

class NullNameException extends Exception {
    public NullNameException(String msg) { super(msg); }
}
public class task3 {
    static void gradeStudent(String name, int marks) throws InvalidMarksException, NullNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new NullNameException("Student name cannot be null!");
        }
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100!");
        }

        System.out.println("Student: " + name + " | Marks: " + marks);
    }

    public static void main(String[] args) {
        try {
            gradeStudent(null, 85); // test case
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            System.out.println("Process Completed");
        }
}
}