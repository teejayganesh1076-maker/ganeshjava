import java.util.*;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter number of rows :");
        
        int rows = in.nextInt();

        for(int i = 0;i <= rows;i++){
            for (int j = 1;j < rows-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}