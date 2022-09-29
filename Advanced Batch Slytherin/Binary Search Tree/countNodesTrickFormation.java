import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++) {
            int nodeValue=sc.nextInt();
            if(nodeValue>=low && nodeValue<=high) {
                count++;
            }
        }
        System.out.println(count);
    }
}
