import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=  new Scanner(System.in);
        int tc=Integer.parseInt(sc.nextLine());
        while(tc-->0){
            int n=Integer.parseInt(sc.nextLine());
            int arr[]=new int[n];
            String temp[]=sc.nextLine().split(" ");
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(temp[i]);
                arr[i]=(int)Math.pow(arr[i],2);
            }
            Arrays.sort(arr);
            for(int val:arr){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}
