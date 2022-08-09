import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new  Scanner(System.in);
        long K=sc.nextLong();
        long x=((-3)+(long)Math.sqrt(3*3+4*K))/2;
        long K1=x*x+3*x;
        if(K==K1 && x>=0){
            System.out.println(x);
        }else{
            System.out.println(-1);
        }
    }
}
/*import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new  Scanner(System.in);
        int k=sc.nextInt();
        //   k=x^2+3*x
        //     3*x=k-x^2;
        //     x=(k-x^2)/3;
        //     x^2+3*x-k;
        //     x=(-b+-swqt(b^2-4*a*c))/2*a

            // if D<0  imaginary
            // id D>0  real
            // if d=0 same
        
        int D=(int)Math.sqrt((9+4*k));
        if(D>=0){
            int ans1=(-3+D)/2;
            int ans2=(-3-D)/2;
            // System.out.print((ans1>ans2)?(int)Math.floor(ans1):(int)Math.floor(ans2));
            if((ans1*ans1+3*ans1)==k){
                System.out.println(ans1);
            }else if((ans2*ans2+3*ans2)==k){
                System.out.println(ans2);
            }else{
                System.out.println(-1);
            }
        }else{
            System.out.println(-1);
        }

    }
}*/
