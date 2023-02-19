import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        String str =sc.next();

        for (int idx=0;idx<str.length();idx++) {
            char ch =str.charAt(idx);

            for (int i=0;i<n;i++) {
                for (int j=i;j<n;j++) {
                    int temp =arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }

            if (ch =='R') {
                for (int i=0;i<n;i++) {
                    int l=0;
                    int r =n-1;

                    while (l<r) {
                        int temp =arr[i][l];
                        arr[i][l]=arr[i][r];
                        arr[i][r] =temp;
                        l++;
                        r--;
                    }
                }
            }
            if (ch =='L') {
                for (int i=0;i<n;i++) {
                    int l=0;
                    int r =n-1;

                    while (l<r) {
                        int temp =arr[l][i];
                        arr[l][i]=arr[r][i];
                        arr[r][i] =temp;
                        l++;
                        r--;
                    }
                }
            }
        }

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            if(i==n-1) break;
            System.out.println();
        }
    }
}
