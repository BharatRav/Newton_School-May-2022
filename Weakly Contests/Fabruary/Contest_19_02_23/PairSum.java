import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr =new long[n];

        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        long maxSum=0;
        Arrays.sort(arr);

        for (int i=0;i<n;i++) {
            maxSum=maxSum+(i*arr[i]);
        }
        System.out.println(maxSum);
    }
}
