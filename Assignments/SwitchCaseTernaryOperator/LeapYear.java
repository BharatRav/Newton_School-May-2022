import java.util.Scanner;
class Main {
   public static void main (String[] args)
   {
       //Capture the user's input
       Scanner scanner = new Scanner(System.in);
       //Storing the captured value in a variable
       int n = scanner.nextInt();
       LeapYear(n);

    
}
static void LeapYear(int year){
    if( year%4==0){
        if(year%100==0){
            if(year%400==0){
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }
        }
        else{
            System.out.print("YES");
        }
    }
    else{
        System.out.print("NO");
    }
     
}
}
