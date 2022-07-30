import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            if(set.contains(value)){
                count++;
            }else{
                set.add(value);
            }
        }
        // for(Integer value: set){
        //     System.out.print( value);
        // }
        System.out.print(count);
    }
}
