import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();	//here it is  guaranteed that a will be divisible by b.
		int b= scan.nextInt();
		if(b>=1 && a<=1000 && b<=a){
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);			
		}

	}
}
