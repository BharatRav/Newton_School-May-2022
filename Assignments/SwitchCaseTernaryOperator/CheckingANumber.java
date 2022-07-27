import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int value=0;	 
		if(N>0){
			value=1;		// +1 stands for positive number
		}
		else if(N<0){
			value=-1;		// -1 stands for negative number
		}
		// else{
		// 	value=0;		//o stands for 0
		// }
		switch(value){
			case 1:
					System.out.print("Positive");
					break;
			
			case -1:
					System.out.print("Negative");
					break;
			case 0:
					System.out.print("Zero");
					break;
			default:
			System.out.print("Enter a valid number");
			

		}
	}
}
