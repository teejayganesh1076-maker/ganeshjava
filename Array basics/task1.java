import java.util.Scanner;

public class task1 {
public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter Array Size :");

    int size = in.nextInt();

    int[] arr = new int[size];
   
    System.out.println("Enter Array Elements :");

    for(int i = 0;i < size;i++){
        arr[i] = in.nextInt();
    }

    for(int i = 0;i < arr.length;i++){
        System.out.println(arr[i]);
    }
}    
}