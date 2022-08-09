import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a1=new int[n];
        int []a2=new int[n];
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            a2[i]=sc.nextInt();
        }
        // int i=0;
        // int j=0;
        int minimumAbsolute=Integer.MAX_VALUE;
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                int temp=(Math.abs(a1[i]-a2[j]));
                if(temp<minimumAbsolute)
                    minimumAbsolute=temp;
            }
        }
        System.out.println(minimumAbsolute);
    }
}
