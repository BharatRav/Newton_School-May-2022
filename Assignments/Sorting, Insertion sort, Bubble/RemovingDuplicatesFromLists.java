import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
                       Scanner sc= new Scanner(System.in);
        TreeSet<String> bharat= new TreeSet<>();
        while(sc.hasNext()){
            // System.out.println(sc.next());
            bharat.add("'"+sc.next()+"'");
        }
        System.out.println(bharat);
        // for(char cal: bharat)        
        //     System.out.println(cal); 
        }
}
