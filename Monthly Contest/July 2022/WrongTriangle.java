import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if(a>=b && a>=c) {
            if(Math.pow(a,2)==(Math.pow(b,2)+Math.pow(c,2))){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else if(b>=a && b>=c) {
            if(Math.pow(b,2)==(Math.pow(a,2)+Math.pow(c,2))){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else if(c>=a && c>=b) {
            if(Math.pow(c,2)==(Math.pow(a,2)+Math.pow(b,2))){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}

/*
Wrong Triangle (Public Contest: July 2022)
Time Limit: 1 sec
Memory Limit: 128000 kB
Problem Statement
You are given three integers A, B and C, which are the side lengths of a triangle in some order. Print "Yes" if this triangle is right-angled, otherwise print "No".
Input
The input consists of a single line containing three space-separated integers A, B and C.

Constraints:
1 ≤ A, B, C ≤ 1000
Output
Print a single word "Yes" if the given triangle is right-angled, otherwise print "No".

Note:
The quotation marks are only for clarity, you should not print them in output.
The output is case-sensitive.
Example
Sample Input 1:
3 4 5
Sample Output 1:
Yes

Sample Input 2:
10 9 10
Sample Output 2:
No

Sample Input 3:
5 4 3
Sample Output 3:
Yes
*/
