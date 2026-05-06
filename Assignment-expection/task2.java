import java.util.Scanner;

// Custom exception for invalid username
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String msg) {
        super(msg);
    }
}

// Custom exception for invalid password
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String msg) {
        super(msg);
    }
}

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String username = "User13";
        String password = "User@1312";
        int attempts = 0, maxAttempts = 3;

        while (attempts < maxAttempts) {
            try {
                System.out.print("Enter Username: ");
                String nameIn = in.nextLine();

                if (!nameIn.equals(username)) {
                    throw new InvalidUsernameException("Invalid Username!");
                }

                System.out.print("Enter Password: ");
                String passIn = in.nextLine();

                if (!passIn.equals(password)) {
                    throw new InvalidPasswordException("Invalid Password!");
                }

                System.out.println("Login Successful");
                return; // exit after success

            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
                attempts++;
            }
        }
        System.out.println("Too Many Attempts Program Terminated");
        System.exit(0);
    }
}
