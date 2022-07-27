import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int result=0;
		int D=sc.nextInt();
		int Q=sc.nextInt();
		if(D>=0 && Q<=100 && Q!=0){
			result=D/Q;
			System.out.println(result);
		}
		else if(Q==0){
			System.out.println("-1");
		}
	}
}
