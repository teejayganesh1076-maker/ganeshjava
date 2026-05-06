import java.util.*;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int rows = in.nextInt();
        int num = 1;
        for(int i = 0;i < rows;i++){
            for(int j = 1;j<=i;j++){
            System.out.print(num);
            num++;
            }
            System.out.println();
        }
    }
}