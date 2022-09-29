import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        Set<Integer> hs= new HashSet<>();
        for(int i=0;i<n;i++) {
            int candies=sc.nextInt();
            hs.add(candies);
        }
        for(int i=0;i<m;i++) {
            int M_studentCandies=sc.nextInt();

            if(hs.contains(M_studentCandies)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
                hs.add(M_studentCandies);
            }
        }
    }
}
