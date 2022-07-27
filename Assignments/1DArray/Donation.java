import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr=new int[n];
		 int max=0;
		 long sum=0;
			 
		 for(int i=0;i<n;i++){
		 	arr[i]=sc.nextInt();
			 if(i==0 && max>=arr[i]){
				 max=arr[i];
			 }
			 if(max<arr[i]){
				 max=arr[i];
			 }
			
			System.out.print(max-arr[i]+" ");
			sum=sum+arr[i]+ max-arr[i];
		 }
		 System.out.println();
		 System.out.print(sum);

	}
}
