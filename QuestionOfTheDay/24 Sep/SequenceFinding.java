import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            end=i;
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            start=0;
            end=i;
        }
        for(Integer ans: arr){
            System.out.print(ans+" ");
        }
    }
}
