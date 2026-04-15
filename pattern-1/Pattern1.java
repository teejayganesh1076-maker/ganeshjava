import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the no of rows: ");
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
