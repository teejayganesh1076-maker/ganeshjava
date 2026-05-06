public class task3 {
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverse(input));
    }
}