import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    private static void getResult(int[] arr, int n) {
        Queue<Integer> disks =new PriorityQueue<>(Comparator.reverseOrder());
        int maxSize =n;

        for (int day =0;day<n;day++) {
            disks.offer(arr[day]);
            while(!disks.isEmpty() && disks.peek()==maxSize) {
                System.out.print(disks.poll()+" ");
                maxSize--;
            }
            System.out.println();
        }

    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        // Stack<Integer> disks =new Stack<>();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] =sc.nextInt();
        }
        getResult(arr,n);
    }

}
