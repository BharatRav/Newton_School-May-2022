import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
         HashMap<Integer,Integer> map=new HashMap<>();
        int count=1;
        for(int i=0;i<n;i++){
            int key=sc.nextInt();
            if(map.containsKey(key)){
                int freq=map.get(key);
                map.put(key,freq+1);
            }else{
                map.put(key,1);
            }
        }
        for(int val:map.keySet()){
            int value=map.get(val);
            if(value>1)
            System.out.println(val+" "+value);
        }
    }
}
