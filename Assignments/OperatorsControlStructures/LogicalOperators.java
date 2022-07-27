import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean result_And=false,result_Or=false, result_Not=false;
		if(a<=10 && b>=10){
			System.out.print(!result_And +" ");
		}else{
			System.out.print(result_And +" ");
		}

		if(a%2==0 || b%2==0){
			System.out.print(!result_Or +" ");
		}else{
			System.out.print(result_Or +" ");
		}


		if(a!=b){
			System.out.print(!result_Not +" ");
		}else{
			System.out.print(result_Not +" ");
		}

	}
}
