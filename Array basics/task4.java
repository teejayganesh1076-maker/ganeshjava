import java.util.*;

public class task4 {
public static void main(String[]args){
    
    Scanner in = new Scanner(System.in);

    System.out.println("Enter Size Of Array :");
    
    int size = in.nextInt();

    int[] arr = new int[size];

    System.out.println("Enter Elements Of Array");

    for(int i = 0;i < size;i++){
        arr[i] = in.nextInt();
    }
    
    int lar = arr[0];

    for(int i = 0;i < arr.length;i++){
        if(arr[i] > lar){
            lar = arr[i];
        }
    }

    System.out.println("Largest :"+lar);

}    
}