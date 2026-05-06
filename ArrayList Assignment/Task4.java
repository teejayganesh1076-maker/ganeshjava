import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        // Input list
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 4, 45, 99, 99));

        // Remove duplicates (optional, if you want unique values only)
        Set<Integer> set = new HashSet<>(list);
        ArrayList<Integer> uniqueList = new ArrayList<>(set);

        // Sort the list
        Collections.sort(uniqueList);

        // Get second largest
        int secondLargest = uniqueList.get(uniqueList.size() - 2);

        System.out.println("Second Largest Element: " + secondLargest);
    }
}

