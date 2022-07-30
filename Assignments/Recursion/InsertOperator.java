import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	public static boolean isRecursionPosible(long sum, long K, long arr[], int idx){
		if(idx== arr.length){
			if(sum==K){
				return true;
			}
			else{
				return false;
			}
		}
		boolean add=isRecursionPosible(sum+arr[idx],K,arr,idx+1);
		if(add)return true;
		boolean sub=isRecursionPosible(sum-arr[idx],K,arr,idx+1);
		if(sub)return true;
		return false;
	}

	public static void main (String[] args) {
                      // Your code here
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		long K=scan.nextLong();
		long [] arr= new long [N];
		for(int i=0;i<N;i++){
				arr[i]=scan.nextLong();
		}
		if(isRecursionPosible(arr[0],K,arr,1)){
			System.out.print("YES");
		}
		else{
			System.out.print("NO");
		}
	}
}
