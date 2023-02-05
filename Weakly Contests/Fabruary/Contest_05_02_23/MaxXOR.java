import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int[] arr = new int[n];

        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }

        int maxNumber =arr[0];
        for (int i=1;i<arr.length;i++) {
            maxNumber=Math.max(maxNumber,arr[i]);
        }
        //using bitmasking approach

        int maxBit = Integer.toBinaryString(maxNumber).length();

        int maxXOR=0;
        int currXOR;
        HashSet<Integer> hs = new HashSet<>();
      //code written by bharat
        for (int i=maxBit-1;i>-1;i--) {
            maxXOR<<=1;
            currXOR=maxXOR|1;

            hs.clear();

            for (int val: arr) {
                hs.add(val>>i);
            }


            for (int j:hs) {
                if(hs.contains(currXOR^j)) {
                    maxXOR=currXOR;
                    break;
                }
            }
        }
        // int max=0;
        System.out.println(maxXOR);
      
    }
}
