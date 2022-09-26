import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        int[] sorted=new int[n];
        for(int i=0;i<n;i++){
            input[i]=sc.nextInt();
            sorted[i]=input[i];
        }

        Arrays.sort(sorted);
        int sum=0;
        for(int i=0;i<n;i++){
            if(input[i]!=sorted[i]){
                sum+=(input[i]+sorted[i]);
                break;
            }
        }
        System.out.println(sum);
    }
}
