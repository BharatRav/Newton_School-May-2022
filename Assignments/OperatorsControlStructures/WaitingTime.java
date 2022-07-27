import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();	//N peoples
		int X= sc.nextInt();	// taking time for each patient
		if(N>=1 && N<=1000){
			if(X>=1 && X<=1000){
				int result= N*X;
				System.out.println(result);
			}
		}
	}
}
