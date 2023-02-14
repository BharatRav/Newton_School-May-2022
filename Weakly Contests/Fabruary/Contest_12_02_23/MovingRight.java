import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc .nextInt();

        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        int max =0;
        for (int i=0;i<n-1;i++) {
            int curr=0;
            while (i<n-1 && arr[i]>=arr[i+1]) {
                i++;
                curr++;
            }
            max =Math.max(max,curr);
        }

        System.out.println(max);
    }
}
