public class Challenge2 {
 /* Question
    res = [0, 1, 1, 2, 2, 9, 9,9, 1, 2, 3, 2, 3]

sort(res)
 no extra space
T(n)

O(1)
     */
    public static void main(String[] args) {
        int arr[]={0, 1, 1, 2, 2, 9, 9,9, 1, 2, 3, 2, 3};
        //taking an helping array of all character
        int helping[]= new int[10];
        for(int i=0;i<arr.length;i++){

            helping[arr[i]]++;
        }
        int k=0;
        for(int i=0;i< helping.length;i++){
            //if(i==0)
                System.out.println("[");
            while(helping[i]!=0) {
                System.out.print(i + " ");
                arr[k]=i;
                k++;
                helping[i]--;
            }
        }
    }
}
