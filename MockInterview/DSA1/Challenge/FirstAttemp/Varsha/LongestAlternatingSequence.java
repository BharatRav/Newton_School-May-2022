import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class ChallengeInterview {
        /*find the longest alternating sequence in an array where x1 < x2 > x3 < x4 > x5..... or x1 >x2 < x3 > x4 < x5.....

I/P - {1,17,5,10,13,15,10,5,16,8}

O/P- 7- (1,17,10,13,10,16,8)

I/P - {1,5,4}

O/P- 3
  */
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int size= sc.nextInt();
            int arr[]= new int [size];
            for(int i=0;i<size;i++){        //input element inserting
                arr[i]=sc.nextInt();
            }

            //logic part
            boolean flag_check=true;
            // false for lesser number
            // true for greater number
            ArrayList<Integer> ls= new ArrayList<>();
            ls.add(arr[0]);
            for(int i=1;i<size;i++){
                if(arr[i]==arr[i-1]){
                    continue;
                }
                if(arr[i]>arr[i-1] && flag_check){
                    ls.add(arr[i]);
                    flag_check=false;
                }else{
                    if(arr[i]<arr[i-1] && flag_check==false){
                        ls.add(arr[i]);
                        flag_check=true;
                    }

                }
            }
            System.out.println(ls);
            System.out.println(ls.size());

        }
}
