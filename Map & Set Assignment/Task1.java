import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        // Sample list with duplicates
        List<String> emails = Arrays.asList(
            "alice@example.com",
            "bob@example.com",
            "alice@example.com",
            "charlie@example.com",
            "bob@example.com"
        );

        // Use a HashSet to remove duplicates
        Set<String> uniqueEmails = new HashSet<>(emails);

        // Convert back to a List if needed
        List<String> result = new ArrayList<>(uniqueEmails);

        // Print unique email IDs
        System.out.println("Unique Emails: " + result);
    }
}
