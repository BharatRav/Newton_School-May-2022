import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int[] arr= new int[N];
        int maxOperation=0;
        boolean checkAllEven=true;//initially all even
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            checkAllEven=(checkAllEven && arr[i]%2==0);
        }

        int count=0;
        if(checkAllEven){// if true means all element even
            for(int i=0;i<N;i++){
                count=0;
                while(arr[i]%2==0){
                    arr[i]=arr[i]/2;
                    if(arr[i]%2==0){
                        count++;
                    }
                }
                maxOperation+=count;
            }
            System.out.println(maxOperation);

        }else{
            System.out.println(0);
        }
        
    }
}
