import java.util.*;

public class Task2 {
    public static void main(String[] args) {
    
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3));

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : list) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

