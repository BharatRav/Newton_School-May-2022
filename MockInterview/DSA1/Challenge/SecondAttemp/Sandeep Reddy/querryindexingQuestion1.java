public class Challenge {
    /* array = [1, 5, 8, 9, 20, 25, 55, 99]

q = [1, 5, 7, 10, 20, 25, 55, 99, 1, 2, 3]

res = [0, 1, -1, -1, 4, 5, 6,7, 0, -1, -1]  which is q itself
     */

    public static  int checkPresentOrNot(int []arr, int value){
        //now check by binary search coz it is sorted
        int l=0;    //starting index
        int r=arr.length;   //ending index for binary search

        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==value){
                return mid;
            }else if(value>arr[mid]){
                l=mid+1;
            }else{
                r= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {1,5,8,9,20,25,55,99};
        int[] q={1,5,7,10,20,25,55,99,1,2,3};// also  result array

        for(int i=0;i<q.length;i++){
            int value=q[i];
            //now check to another fuction which follow binary search and give index
            q[i]=checkPresentOrNot(arr,value);
        }
        //when logic complete then print
        for(int i=0;i<q.length;i++){
            System.out.print(q[i]+" ");
        }
    }
}
