import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int N = 10;
        int[] arr = {1, 2, 4, 6, 7, 9};

        // Put all array elements into a Set for quick lookup
        Set<Integer> present = new HashSet<>();
        for (int num : arr) {
            present.add(num);
        }

        // Check from 1 to N which numbers are missing
        List<Integer> missing = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (!present.contains(i)) {
                missing.add(i);
            }
        }

        System.out.println("Missing Numbers: " + missing);
    
    }
}