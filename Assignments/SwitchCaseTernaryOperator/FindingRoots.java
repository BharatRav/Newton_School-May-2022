import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
		Scanner sc= new Scanner(System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		float c=sc.nextFloat();
		float root1,root2;
		/* if determinant D=b^2-4*a*c 
		 determinant>0 then --> real roots and different
		 determinant==0 then--> real and same roots
		 determinant<0 then--> imaginary and different
		 */
		double Det= b*b-(4*a*c);
		if(Det>0){
			// Real and differen roots
			 root1= (float)(-b+Math.sqrt(Det))/(2*a);
			 root2= (float)(-b-Math.sqrt(Det))/(2*a);
			System.out.printf("%.2f",root1);
			System.out.println();
			System.out.format("%.2f",root2);
			System.out.println();
		}
		else if(Det==0){
			//Real and same roots 
			root1= (-b)/(2*a);
			root2= (-b)/(2*a);
			System.out.format("%.2f",root1);
			System.out.println();
			System.out.format("%.2f",root2);
			System.out.println();
		}
		else if(Det<0){
			//imaginary and different roots
			float realPart=(-b)/(2*a);
			float imaginaryPart=(float)(Math.sqrt(-Det)/(2*a));
			//System.out.format("%.2f",realPart+" + i"+"%.2f",imaginaryPart);//root1
			System.out.format("%.2f+i%.2f",realPart,imaginaryPart);//root1
			System.out.println();
			//System.out.format("%.2f",realPart+" - i" + "%.2f",imaginaryPart);//root2
			System.out.format("%.2f-i%.2f",realPart,imaginaryPart);//root2
			System.out.println();
		}
	}

}
