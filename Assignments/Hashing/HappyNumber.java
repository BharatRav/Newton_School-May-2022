import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static boolean chechHappyNumber(long n){
    
    long result=0;
    while(n>9){
        result=0;
    while(n>0){
        result+=Math.pow(n%10,2);
        n=n/10;
    }
    n=result;
    }

        return (n==1)?true:false;
    }

    public static void main (String[] args) {
        Scanner Sc= new Scanner(System.in);
        long n=Sc.nextLong();
        System.out.println(chechHappyNumber(n)?true:false);
        
    }
}
