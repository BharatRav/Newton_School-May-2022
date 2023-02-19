import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];

        for (int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        //logic part

        HashMap<Integer,Integer> map =new HashMap<>();

        boolean flag=false; //initially

        for (int i=0;i<n;i++) {
            if (map.containsKey(arr[i])) {
                flag=true;
                break;
            } else {
                map.put(arr[i],1);
            }
        }

        if (flag) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
