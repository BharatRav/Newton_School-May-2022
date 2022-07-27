import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		int sum=0;
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<5;i++){
			sum+=sc.nextInt();
		}
		 double result= sum/5.0;
			if(result>=80){
				System.out.print("A");
			}else if(result>=60){
				System.out.print("B");
			}else if(result>=40){
				System.out.print("C");
			}
			else{
				System.out.print("D");
			}
		
	}
}
