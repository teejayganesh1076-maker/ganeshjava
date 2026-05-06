import java.util.*;
public class task2 {
public static void main(String[]args){

    Scanner in = new Scanner(System.in);

    System.out.println("Enter the size of array :");

    int size = in.nextInt();
    
    int sum = 0;

    int[]arr = new int[size];
    
    System.out.println("Enter Array Elements :");

    for(int i = 0;i < size;i++){
        arr[i] = in.nextInt();
          sum+= arr[i];
    }

    System.out.println("Sum of array elements :"+sum);
}    
}