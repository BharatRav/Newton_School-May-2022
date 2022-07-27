import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int C=sc.nextInt();
		int S=sc.nextInt();
		if(C>=1 && S<=1000 && C<=S){
			int profit;
			System.out.println(profit=S-C);
		}
	}
}
