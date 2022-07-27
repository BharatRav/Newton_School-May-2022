import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int tc=Integer.parseInt(sc.nextLine());
		while(tc>0){
			int n=Integer.parseInt(sc.nextLine());
			int arr[]= new int[n];
			String temp[] =sc.nextLine().split(" ");
			for(int i=0;i<n;i++){
				arr[i]=Integer.parseInt(temp[i]);
			}
		//	Arrays.sort(arr);
			int max=arr[0];
			int min=arr[0];
			for(int i=0;i<n;i++){
				if(max<arr[i]){
					max=arr[i];
				}
				if(min>arr[i]){
					min=arr[i];
				}
			}
			System.out.println(max+" "+min);
			tc--;
		}
	}
}
