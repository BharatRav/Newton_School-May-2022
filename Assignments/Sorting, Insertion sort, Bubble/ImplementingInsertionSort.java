import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int[] insetionSort(int a[]){
        for(int i=1;i<a.length;i++){
            int j=i;
            while((j>0) && (a[j]<a[j-1] )){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }
        }
        return a;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc>0){
            int n=sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            //System.out.println(Arrays.toString(insetionSort(arr)));
            insetionSort(arr);
            for(int val:arr)
                System.out.print(val+" ");

            System.out.println();
            tc--;
        }
    }
}
