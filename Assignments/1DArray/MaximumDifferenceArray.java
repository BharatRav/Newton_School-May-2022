import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
    //method 1--> my logic
		// Scanner sc= new Scanner(System.in);
		// int n=sc.nextInt();
		// int[] arr= new int[n];
		// for(int i=0;i<n;i++){
		// 	arr[i]=sc.nextInt();
		// }
		// long max_value=arr[0];
		// int max_index=-1;
		// for(int i=1;i<n;i++){
		// 	if(max_value<arr[i]){
		// 		max_value=arr[i];
		// 		max_index=i;
		// 	}
		// }
		// int min=0;
		// int min_value=0;
		// int min_index=0;
		// for(int i=0;i<n;i++){
		// 	if(min_value>arr[i]){
		// 		min_value=arr[i];
		// 		min_index=i;
				 
		// 	}
		// }
		// // if(max_index==0){
		// // 	System.out.print(-1);
		// // }else{
		// // System.out.print(arr[max_index]-arr[min_index]);
		// // }
		// if(max_index>min_index && max_value > min_value){
		// 	System.out.print(max_index-min_index);
		// }
		// else{
		// 	System.out.print("-1");
		// }




		// selva sir logic   <--- method 2
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxDiff = -1;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>arr[i]){
        //             int diff = j-i;
        //             if(maxDiff<diff){
        //                 maxDiff = diff;
        //             }
        //         }
        //     }
        // }

        int[] maxArray = new int[n];
        maxArray[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxArray[i] = Math.max(arr[i], maxArray[i + 1]);
        }

        int i = 0, j = 0;
        while (i < n && j < n) {
            if (arr[i] < maxArray[j]) {
                int diff = j - i;
                if (maxDiff < diff) {
                    maxDiff = diff;
                }
                j++;
            } else {
                i++;
            }
        }
        //TC: O(n)
        //SC: O(n)
        System.out.println(maxDiff);
	}
}
