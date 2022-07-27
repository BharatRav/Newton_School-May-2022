import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int M=sc.nextInt();	//for height
		int N=sc.nextInt();	//for breadth
		for(int i=0; i<M;i++){
			for(int j=0;j<N;j++){
				if(j==0 || j==(N-1)){
					System.out.print("*");
				}
				else{
					if(i==0 || i==(M-1)){
					System.out.print("*");
					continue;
				}
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
