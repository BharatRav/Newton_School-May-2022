import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int tc= sc.nextInt();
		while(tc>0){
			int rows_length= sc.nextInt();
			int cols_length= sc.nextInt();
			int[][] arr= new int[rows_length][cols_length];
			for(int row=0;row<rows_length;row++){
				for(int cols=0;cols<cols_length;cols++){
					arr[row][cols]= sc.nextInt();
				}
			}
			  
			if(rows_length==1){
				for(int i=0;i<cols_length;i++){
					System.out.print(arr[0][i]+" ");
				}
			}else if(cols_length==1){
				for(int i=0;i<rows_length;i++){
					System.out.print(arr[i][0]+" ");
				}
			}
			else{
					// for first row
				for(int i=0;i<cols_length;i++){
					System.out.print(arr[0][i]+" ");
				}
				// for right column
				for(int i=1;i<rows_length-1;i++){
					System.out.print(arr[i][cols_length-1]+" ");

				}
				//last row
				for(int i=cols_length-1;i>=0;i--){
					System.out.print(arr[rows_length-1][i]+" ");
				}
				// for left column
				for(int i=rows_length-2;i>0;i--){
					System.out.print(arr[i][0]+" ");
				}
			}	
			System.out.println();
			tc--;
		}
	}
}
