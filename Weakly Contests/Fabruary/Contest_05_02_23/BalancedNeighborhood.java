import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();

        int[][] NXM= new int[n][m];

        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                NXM[i][j]= sc.nextInt();
            }
        }

        System.out.println(ans(NXM,n,m)?"YES":"NO");
    }
//code written by bharat      if it is helpful then giv a star to repository

    private static boolean ans(int[][] NXM, int n,int m) {

        for (int i=1;i<n-1;i++) {
            for (int j=1;j<m-1;j++) {
                if((NXM[i-1][j]+NXM[i+1][j]+NXM[i][j-1]+NXM[i][j+1])%2 !=0){
                    return false;
                }
            }
        }
        return true;
    }
}
