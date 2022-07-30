import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int maxE = -1;
        for (int i = 0; i < n; i++) {
            maxE = Math.max(maxE, arr[i]);
        }

        int[] freq = new int[maxE + 1];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        int maxF = -1;
        for (int i = 0; i <= maxE; i++) {
            maxF = Math.max(maxF, freq[i]);
        }

        while(maxF > 0){
            for(int i=maxE; i>=0;i--){
                if(maxF == freq[i]){
                    System.out.print(i + " ");
                }
            }
            maxF--;
        }

    }
}
