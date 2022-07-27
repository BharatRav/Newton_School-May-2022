import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int Integer= sc.nextInt();
		long Long=sc.nextLong();
		float Float=sc.nextFloat();
		double Double =sc.nextDouble();
		char Char = sc.next().charAt(0);
		System.out.println(Integer);
		System.out.println(Long);
		System.out.format("%.2f",Float);
		System.out.println();
		System.out.format("%.4f",Double);
		System.out.println();
		System.out.println(Char);
	}
}
