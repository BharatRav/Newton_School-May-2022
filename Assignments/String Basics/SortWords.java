import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ",-1);
        Arrays.sort(arr);
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
