import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){       //insertion
            arr[i]=sc.nextInt();
        }
        //buble sort
        for(int j=0;j<n;j++){
            for(int i=0;i<n-1;i++){
                if(arr[i]<arr[i+1]){
                    arr[i]=arr[i]+arr[i+1];
                    arr[i+1]=arr[i]-arr[i+1];
                    arr[i]=arr[i]-arr[i+1];
                    // int temp=arr[i];
                    // arr[i]=arr[i+1];
                    // arr[i+1]=temp;

                }
            }
        }
        //now printing
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
