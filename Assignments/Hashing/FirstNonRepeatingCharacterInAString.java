import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        int[] ASCII=new int[256];
        for(int i=0;i<ASCII.length;i++){
            ASCII[i]=str.length();          //arr.length taking starting that no repeating
        }                                   // arr.length+1=repeating
        // im treversing string only one time
        for(int i=0;i<arr.length;i++){
            int p=arr[i];
            if(ASCII[p]!=arr.length){
                ASCII[p]=arr.length+1;
            }else{
                ASCII[p]=i;
            }
        } int min=str.length();
        for(int i=0;i<ASCII.length;i++){
            if(min>ASCII[i]){
                min=ASCII[i];
            }
        }
        if(min!=str.length()){
            System.out.print(min);
        }else{
            System.out.print(-1);
        }

    }
}
