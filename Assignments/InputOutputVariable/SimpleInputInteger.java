import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		if(N>=1 && N<=100){
			System.out.println(N);
		}
	}
}
