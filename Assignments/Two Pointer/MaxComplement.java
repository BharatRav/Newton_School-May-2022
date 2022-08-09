import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //using two pointer
        int max=0,product=0;
        int i=0,j=arr.length-1;
        while(i<j){
            product=arr[i]*arr[j];
            if(product>max){
                max=product;
            }
            i++;
            j--;
        }
        System.out.println(max);
    }
}
