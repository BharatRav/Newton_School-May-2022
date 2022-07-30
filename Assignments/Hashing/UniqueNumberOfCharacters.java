import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<Character> set=new HashSet<>();
        int unique=0;
        for(int i=0;i<str.length();i++){
             set.add(str.charAt(i));
        }
         
            System.out.println(set.size());
        
    }
}
