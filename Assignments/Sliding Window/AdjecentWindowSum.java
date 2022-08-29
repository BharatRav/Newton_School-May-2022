import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static boolean printAdjacentWindowSum (int[] arr,int n,int k,long result){
        long sum1=0;
        for(int i=0;i<k;i++){
            sum1+=arr[i];
        }
        long sum2=sum1;
        for(int j=0;j<n;j++){   //sum1 start from 1 index before sum2
            sum2+=arr[(j+k)%n];
            sum2-=arr[j];
            if(sum1+sum2==result){
                return true;
            }
            sum1=sum2;
        }
        return false;
    }
    //line 13 me n-k krke line 14 me arr[j+k] krdu to chalega
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        long sum=sc.nextLong();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //calling function
        System.out.println((printAdjacentWindowSum(arr,n,k,sum))?"YES":"NO");
    }
}
