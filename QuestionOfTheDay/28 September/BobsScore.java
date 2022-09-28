/*
Link:-  https://my.newtonschool.co/playground/code/024fyy8p4e50/
*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    private static long gcd(long a,long b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
    
    static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b; 
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        long A=sc.nextLong();
        long B=sc.nextLong();
        for(int i=1;i<n;i++) {
            long first=sc.nextLong();
            long second=sc.nextLong();
            if(gcd(A,first)>gcd(A,second)) {
                A=gcd(A,first);
            } else {
                A=gcd(A,second);
            }
            if(gcd(B,first)>gcd(B,second)) {
                B=gcd(B,first);
            } else {
                B=gcd(B,second);
            }
        }
        long result=lcm(A,B);
        System.out.println(result);

    }   
}
/*
Bob’s Score
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Bob has two boxes, yellow and green, and N card packs. Initially, both boxes are empty. Each card pack contains two cards with integers written on them. We know that the i- th card pack contains a card with xi​ and another with yi​.
For each card pack, Bob will put one of its cards in the yellow box, and the other in the green box.
After Bob put all cards in the boxes,
Calculate the score:
a) Let A = GCD(all integers in the yellow box).
b) Let B = GCD(all integers in the green box).
Bob score will be the least common multiple of A and B.
Find the maximum possible score Bob can achieve.
Input
The first line contains and integer N
The ith of the next N line contains 2 integers, xi and yi.

Constraints:
All values in input are integers.
1≤N≤50
1≤xi​, yi​≤10^9.
Output
Print the maximum possible score.
Example
Sample Input 1:
2
2 15
10 6

Sample Output 1:
10


Sample Input 2:
5
148834018 644854700
947642099 255192490
35137537 134714230
944287156 528403260
68656286 200621680

Sample Output 2:
238630
*/
