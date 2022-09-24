import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            end=i;
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            start=0;
            end=i;
        }
        for(Integer ans: arr){
            System.out.print(ans+" ");
        }
    }
}

/*
Sequence Finding
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You have an empty sequence A. Along with that you are given an array B of size N. You create a new integer i = 0 and perform N operations on the sequence A in the following way:

Check if i == N + 1, break.

Append Bi to the end of A and increment i by 1.

Reverse the sequence A.

Find the sequence A after all the operations.
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= Bi <= 109
Output
Print the sequence A after all the operations.
Example
Sample Input:
4
1 2 3 4

Sample Output:
4 2 1 3
*/
