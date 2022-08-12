import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static String after_K_Digits_Removing(String number,int k){
        //corner case
        if(number.length()==k){
            return "0";
        }else{
            Stack<Character> st= new Stack<>();

            for(int i=0;i<number.length();i++){
                char ch= number.charAt(i);
                while(!st.isEmpty() && k>0 && st.peek()>ch){
                    st.pop();
                    k--;
                }
                st.push(ch);
            }
            while(!st.isEmpty() && k>0){
                st.pop();
                k--;
            }
            StringBuilder sb= new StringBuilder();
            while(!st.isEmpty()){
                sb.insert(0,st.pop());
            }
            while(sb.toString().startsWith("0")){
                sb.deleteCharAt(0);
            }
            return sb.length()==0?"0":sb.toString();
        }
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int k=sc.nextInt();
        System.out.println(after_K_Digits_Removing(str,k));
    }
}
