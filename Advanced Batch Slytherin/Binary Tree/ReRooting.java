import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int leftChild=sc.nextInt();
            int rightChild=sc.nextInt();

            if(leftChild==-1 || rightChild==-1){
                System.out.print(i+" ");
            }
        }
    }
}
