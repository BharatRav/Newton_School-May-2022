import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		
		// for taking input  module a
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		//int[][] chessBoard=new int[n][n];
		int match_0=0;
		for(int i=0;i<n;i++){
			String line[]=sc.nextLine().split(" ");
			for(int j=0;j<n;j++){
				//chessBoard[i][j]=Integer.parseInt(line[j]);
				int num=Integer.parseInt(line[j]);
				if(num==(i+j)%2){
					match_0++;
				}
			}	
		}
		int match_1=((n*n)-match_0);
		System.out.print(Math.min(match_0,match_1));
	}
}
