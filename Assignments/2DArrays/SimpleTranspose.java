import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= Integer.parseInt(sc.nextLine());
		int[][] arr= new int[n][n];
		 for(int rows=0;rows<n;rows++){
			 for(int cols=0;cols<n;cols++){
				 arr[rows][cols]=sc.nextInt();
			 }
		 }
		 for(int rows=0;rows<n;rows++){
			 for(int cols=0;cols<n;cols++){
				 System.out.print(arr[cols][rows]+" ");
			 }
			 System.out.println();
		 }
	}
}
