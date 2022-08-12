import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        Stack<Character> ch= new Stack<>();
        Stack<Integer> index= new Stack<>();
        index.add(-1);
        int maxlen=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                ch.push('(');
                index.push(i);
            }else{
                if(!ch.isEmpty() && ch.peek()=='('){
                    ch.pop();
                    index.pop();
                    maxlen=Math.max(i-index.peek(),maxlen);
                }else{
                    index.push(i);
                }
            }
        }
        System.out.println(maxlen);
    }
}
