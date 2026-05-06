import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class task3 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter number of rows :");
    int rows = in.nextInt();
    
    for(int i = 0;i <= rows;i++){
        for(int j = 1;j <= i;j++){
        System.out.print(j);
        }
        System.out.println();
    }
}    
}