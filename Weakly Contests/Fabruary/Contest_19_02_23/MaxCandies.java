import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr = new int[2][n];

        for (int i=0;i<2;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        //dp approach robot approach on leetcode

        int[][] dp =new int[3][n+1];

        for (int i=1;i<=2;i++) {
            for (int j=1;j<=n;j++) {
                dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1])+arr[i-1][j-1];
            }
        }

        System.out.println(dp[2][n]);
    }
}
