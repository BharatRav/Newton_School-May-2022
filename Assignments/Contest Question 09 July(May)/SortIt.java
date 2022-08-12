import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int count_0=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0){
                count_0++;
            }
        }
        int result=0;
        for(int i=0;i<count_0;i++){
            if(arr[i]!=0){
                result++;
            }
        }
        System.out.println(result);

    }
}
