public class task6 {
      public static void main(String[] args) {
        int size = 9; 
        int width = 11;

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print(" "); 
            
            for (int j = 0; j < size; j++) {
                // Diagonal conditions: j == i OR j == size - 1 - i
                if (j == i || j == (size - 1 - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}