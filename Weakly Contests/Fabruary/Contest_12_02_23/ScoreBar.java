import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int result =0;
        int[] arr =new int[n];
        arr[0]=sc.nextInt();
        for (int i=1;i<n;i++) {
            arr[i]=sc.nextInt();
            result =Math.max(result,arr[i]-arr[i-1]);
        }        
        System.out.println(result);
    }
}
