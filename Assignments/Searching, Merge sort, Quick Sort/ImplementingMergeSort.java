public static int[] implementMergeSort(int arr[], int start, int end)
    {
        // Your code here
       // You can have your own function where you will use 
      // start and end position for divide purpose  
      if(start<end){
        int mid=(start+end)/2;
        implementMergeSort(arr,start,mid);
        implementMergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
      }
      return arr;
    }
    public static void merge(int arr[],int start,int mid,int end){
      int n1=mid-start+1;
      int n2=end-mid;
      int a1[]=new int[n1];
      int a2[]=new int[n2];
      for(int i=0;i<n1;i++){
        a1[i]=arr[start+i];
      }
      for(int j=0;j<n2;j++){
        a2[j]=arr[mid+1+j];
      }
      int i=0,j=0,k=start;
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
        k++;
        i++;
      }
      while(j<n2){
        arr[k]=a2[j];
        j++;
        k++;
      }
    }
