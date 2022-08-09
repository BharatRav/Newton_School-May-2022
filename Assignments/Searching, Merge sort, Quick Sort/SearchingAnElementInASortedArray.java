static int isPresent(long arr[], int n, long k)
{
	    // Your code here
  // method linear approach
		// int ans=-1;
		// for(int i=0;i<n;i++){
		// 	if(k==arr[i]){
		// 		ans=1;
		// 		break;
		// 		}
		// }
		// return ans;
  
  // method binary search
		int l=0;
		int r=n-1;
		while(l<=r){
			int mid=(l+r)/2;
			if(arr[mid]==k){
				return 1;
			}else{
				if(k<arr[mid]){
					r=mid-1;
				}else{
					l=mid+1;
				}
			}
		}
		return -1;
}
