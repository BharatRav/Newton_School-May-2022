import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int A= sc.nextInt();
		int B= sc.nextInt();
		int initial=10;
		int random=initial;
		random+=A;
		random*=2;
		random+=B;
		random/=2;
		random-=initial;
		System.out.println(random);

	}
}
