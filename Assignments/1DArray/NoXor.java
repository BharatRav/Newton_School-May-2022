import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		//int[] arr= new int[n];
		long sum=0;
		for(int i=1;i<=n;i++){
			 int num=sc.nextInt();
			sum= sum+((n-i)^num);
		}
		System.out.print(sum);
	}
}
