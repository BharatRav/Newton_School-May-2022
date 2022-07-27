import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc= new Scanner(System.in);
		int N =sc.nextInt();
		int  sum=0;
		double mean=0;
		if(N>=1 && N<=100){
			int[] arr= new int[N];
			for(int i=0;i<N;i++){
				arr[i]=sc.nextInt();
				sum+=(arr[i]*arr[i]);
			}
			mean=(double)sum/N;
			System.out.format("%.6f",Math.sqrt(mean));
		}
		 
}
}
