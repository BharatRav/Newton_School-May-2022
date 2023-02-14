import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    private static boolean isPossible(int d,String n) {
        for (int i=0;i<d;i++) {
            if (i!=0 && n.charAt(i)=='0') {
                return true;
            } 
            if(n.charAt(i)=='5') {
                return true;
            }
        }
        return false;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0) {
            int d=sc.nextInt();
            String n=sc.next();
            System.out.println(isPossible(d,n)?"Yes":"No");
        }
    }
}
