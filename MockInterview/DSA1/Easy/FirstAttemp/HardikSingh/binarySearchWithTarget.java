public class BinarySearch {
    public static void main(String[] args) {
        int []arr={2,5,4,6,7,8,15,14,};
        //          0 1 2 3 4 5 6 7
        /*l=0,h=7 mid =3*/
        int target =3;
        boolean flag=false;
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==target){
                flag=true;
                break;
            }else if(arr[mid]<target) {
                l=mid+1;
            }else{

                h = mid - 1;

            }
        }
        System.out.println(flag);


    }
}
