import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        //int answer = ((int)Math.pow(2, n) - 1) - n;
        int answer = (1 << n) - 1 - n; // this is called left shift oparator
                // x<<y==x*2^y;

        System.out.println(answer);
    }
}
