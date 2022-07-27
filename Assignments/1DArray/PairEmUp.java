import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= Integer.parseInt(sc.nextLine());
		String temp[]=sc.nextLine().split(" ");
		int arr[] =new int[n];
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(temp[i]);
			
		}
		Arrays.sort(arr);
		int i=0,j=n-1,ans=0;
		while(i<j){
			int pairsum=arr[i]+arr[j];
			if(ans<pairsum){
				ans=pairsum;
			}
			 i++;
			 j--;
		}
		System.out.println(ans);
	}
}
