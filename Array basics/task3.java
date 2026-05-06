import java.util.*;
public class task3 {
public static void main(String[]args){
    
    Scanner in = new Scanner(System.in);

    System.out.println("Enter Size Of Array :");

    int size = in.nextInt();

    int[] arr = new int[size];

    int sum = 0;

    System.out.println("Enter Array Elements :");

    for(int i = 0; i < size;i++){
        arr[i] = in.nextInt();
        sum+= arr[i];
    }
    double avg = (double)sum/size;

    System.out.println("Average of array element :"+avg);
}    
}