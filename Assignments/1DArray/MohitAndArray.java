import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= Integer.parseInt(sc.nextLine());
		int[] arr= new int[n+1];
		for(int i=1;i<n+1;i++){
			arr[i]=i;
		}
		int brr[]= new int[n];
		for(int i=1;i<n;i++){
			brr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++){
			for(int j=1;j<n+1;j++){
				if(brr[i]==arr[j]){
					arr[j]=0;
					break;
				}
			}
		}

		for(int i=0;i<n+1;i++){
			 if(arr[i]!=0){
				 System.out.print(arr[i]);
				 break;
			 }
		}
	}
}
