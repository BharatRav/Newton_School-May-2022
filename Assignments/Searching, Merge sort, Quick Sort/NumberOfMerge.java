import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int count=0;
    public static void Merge(int arr[],int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int a1[]=new int[n1];
        int a2[]=new int[n2];
        for(int i=0;i<n1;i++){
            a1[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            a2[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(a1[i]<a2[j]){
                arr[k]=a1[i];
                i++;
            }else{
                arr[k]=a2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=a1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=a2[j];
            j++;
            k++;
        }
        
        count++;
    }
    public static void MergeSort(int arr[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            MergeSort(arr,l,mid);
            MergeSort(arr,mid+1,r);
            Merge(arr,l,mid,r);
        }
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MergeSort(arr,0,n-1);
        for(int val:arr)
            System.out.print(val+" ");
            System.out.println();
        System.out.print(count);
    }
}
