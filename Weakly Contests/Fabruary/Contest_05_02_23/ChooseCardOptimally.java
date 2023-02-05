import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();

        int[] a = new int[n];
        int[] b= new int[m];
        
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }

        for (int i=0;i<m;i++) {
            b[i]= sc.nextInt();
        }

        //very easy code written by bharat
        Arrays.sort(a);
        Arrays.sort(b);

        if (a[n-1]<b[m-1]){     //means  max in  both
        System.out.println("Shubham");
        } else{
            System.out.println("Maruti");
        }
    }
}
