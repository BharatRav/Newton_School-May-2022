import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int x=sc.nextInt();
        int start =-1000000;

        if ((x-k+1) >=start && x+k-1<=1000000) {
            int i=x-k+1;
            while (i<=(x+k-1)) {
                System.out.print(i+" ");
                i++;
            }
        }
    }
}
