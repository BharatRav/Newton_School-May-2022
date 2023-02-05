import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();

        int[] arr =new int[n];
        // long sum=0;
        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        //logic part
        //code written by bharat
        System.out.println(ans(arr,k,n));
    }
    private static int ans(int[] arr,int k,int n) {
        for (int i=k;i<n;i++) {
            if (arr[i]==arr[i-k]) {
                return 1;
            }
        }

        return 0;
    }
}
