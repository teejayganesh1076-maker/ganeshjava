import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        String str = "aabbc";

        // Map to store character frequencies
        Map<Character, Integer> freqMap = new HashMap<>();

        // Loop through each character
        for (char ch : str.toCharArray()) {
            // If character already exists, increase count
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Print the frequency map
        System.out.println(freqMap);
    }
}

