//package Collections;
import java.io.*; // for handling input/output
import java.util.*;
//import java.util.ArrayList; // contains Collections framework


// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc= new Scanner(System.in);
		String temp[]= sc.nextLine().split(" ");
		int n= Integer.parseInt(temp[0]);
		int m=Integer.parseInt(temp[1]);

		int first[]=new int[n];
		int second[]=new int[m];

		String line_first[]=sc.nextLine().split(" ");
		String line_second[]=sc.nextLine().split(" ");
		for(int i=0;i<n;i++){
			first[i]=Integer.parseInt(line_first[i]);
		}
		for(int i=0;i<m;i++){
			second[i]=Integer.parseInt(line_second[i]);
		}


		ArrayList<Integer> list=new ArrayList<>();
		
	 
		for(int i=0;i<n;i++){
			list.add(first[i]);
		}
		for(int i=0;i<m;i++){
			list.add(second[i]);
		}
		Collections.sort(list);
		for(int i=0;i<(n+m);i++)
		System.out.print(list.get(i)+" ");
	}
}
