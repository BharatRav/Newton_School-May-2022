import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	public static String checkprime(int number){
		for(int i=2;i<=Math.sqrt(number);i++){
			if(number%i==0)
				return "No";
		}
		return "Yes";
	}

	public static void main (String[] args) {
                      // Your code here
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc>0){
			int number=sc.nextInt();
			String result=checkprime(number);
			System.out.println(result);
			tc--;
		}
		
	}
}
