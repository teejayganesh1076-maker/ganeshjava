import java.util.*;
public class task5 {
public static void main(String[]args){
    
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the size of Array :");

    int size = in.nextInt();

    int[] arr = new int[size];

    System.out.println("Enter the Array Elements :");


    for(int i = 0;i < size;i++){
        arr[i] = in.nextInt();
    }

    int small = arr[0];

    for(int i = 0;i < arr.length;i++){
        if(arr[i] < small){
            small = arr[i];
        }
    }

    System.out.println("Smallest :"+small);
    
}    
}