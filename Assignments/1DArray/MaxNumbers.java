import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int tc= Integer.parseInt(sc.nextLine());	//contains the number of test cases
		for(int k=0;k<tc;k++){
			int n= Integer.parseInt(sc.nextLine());
			int arr[]= new int[n];
			String temp[]= sc.nextLine().split(" ");
			for(int j=0;j<n;j++){
				arr[j]=Integer.parseInt(temp[j]);
			}
			
			int firstMax,secondMax,thirdMax;
			int maxIndex=0;
			for(int i=0;i<n;i++){
				if(arr[maxIndex]<arr[i]){
					maxIndex=i;
				}
			}
			firstMax=arr[maxIndex];
			arr[maxIndex]=-1;

			maxIndex=0;
			for(int i=0;i<n;i++){
				if(arr[maxIndex]<arr[i]){
					maxIndex=i;
				}
			}
			secondMax=arr[maxIndex];
			arr[maxIndex]=-1;

			maxIndex=0;
			for(int i=0;i<n;i++){
				if(arr[maxIndex]<arr[i]){
					maxIndex=i;
				}
			}
			thirdMax=arr[maxIndex];
			arr[maxIndex]=-1;
			System.out.println(firstMax+" "+secondMax+" "+thirdMax);
		}		
		 
	}
}
