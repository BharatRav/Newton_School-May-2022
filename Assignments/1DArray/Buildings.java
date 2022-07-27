import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc= new Scanner(System.in);
		int n= Integer.parseInt(sc.nextLine());
		String temp[]=sc.nextLine().split(" ");
		int[] arr=new int[n];
		int ans=1;
		arr[0]=Integer.parseInt(temp[0]);
		int max =arr[0];	//assuming
		for(int i=1;i<n;i++){
			arr[i]=Integer.parseInt(temp[i]);

			if(max<arr[i]){
				ans++;
				max=arr[i];
			}
		}
		System.out.println(ans);
	}
}
