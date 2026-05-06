import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        // Input list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(2);

        int element = 2; // Element to remove

        // Remove all occurrences
        list.removeIf(num -> num == element);

        System.out.println(list); // [1, 3, 4]
    }
}