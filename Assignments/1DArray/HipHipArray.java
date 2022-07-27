import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= Integer.parseInt(sc.nextLine());
		String temp[]= sc.nextLine().split(" ");
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[n-i-1]=Integer.parseInt(temp[i]);
		}
		long sum=0, product=1;
		for(int i=0;i<n;i++){
			if(i%2==1){
				sum+=arr[i];
			}
			else{
				product*=arr[i];
			}
		}
		System.out.println(sum+" "+product);

	}
}
