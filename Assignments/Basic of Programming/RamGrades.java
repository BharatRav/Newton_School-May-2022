import java.io.*; // for handling input/output
import java.util.*;
  // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
	Scanner scan = new Scanner(System.in);
	int var1= scan.nextInt();
	int var2= scan.nextInt();
	int var3= scan.nextInt();
	int var4= scan.nextInt();
	int total =0;
	int sum= var1+var2+var3+var4;
	total=sum/4;
	System.out.println(total);
	}
}
