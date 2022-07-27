import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);
        int s=sc.nextInt();
        int[] arr= new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int c=sc.nextInt();
        int arr_2nd[]=new int[c];
        for(int i=0;i<c;i++){
            arr_2nd[i]=sc.nextInt();
        }
        int count=0;        //counting no. of matching 
        for(int i=0;i<c;i++){       //for loop for comparison of every permutation of arr_2nd
            //first array_2nd check
            //System.out.println();
            for(int j=0;j<s-c-1;j++){// agr me j<=s-c+1 kr du to test case 16 bhi chalta h
                boolean flag =false;
                if(arr_2nd[0]==arr[j] ){
                    //code
                    for(int m=1;m<c;m++){
                        if(arr_2nd[m]==arr[j+m]){
                            if(m==(c-1)){
                                flag=true;
                            }
                        }
                        // else{
                        //     break;
                        // }
                    }
                    if(flag){
                        j=j+c-1;   //because flag true so thats why j increase by arr_2nd length
                        count++;
                    }
                }
            }
            // now cyclic perputation
            for(int j=1;j<c;j++){       //for loop for right shift
                int temp=arr_2nd[j];
                arr_2nd[j]=arr_2nd[j-1];
                arr_2nd[j-1]=temp;
            }
            // for(int k=0;k<c;k++){   //printing elements
            //     System.out.print(arr_2nd[k]+" ");
            // }
        }
        //System.out.println();
        System.out.print(count);
        
    }
}
//currently this is logic what i hv and im tring to make another logic guys
