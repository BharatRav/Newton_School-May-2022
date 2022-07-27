import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


class Main {
	public static void main (String[] args) {
		Scanner scan= new Scanner(System.in);
		int number= scan.nextInt();
		if(number>=1 && number<=10){
			System.out.println(number);
		}
	}
}
