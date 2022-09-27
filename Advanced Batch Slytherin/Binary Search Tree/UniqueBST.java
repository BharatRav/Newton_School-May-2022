import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int[] catalan = new int[n+1];
        catalan[0] = catalan[1]=1;

        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                catalan[i]+=(catalan[j]*catalan[i-1-j]);
            }
        } 
        System.out.println(catalan[n]);
    }
}
