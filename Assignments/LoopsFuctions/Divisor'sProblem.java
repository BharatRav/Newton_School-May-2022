static int DivisorProblem(int N){
int ans=0;
	while(N>1){
		int cnt=2;
		while(N%cnt!=0){
		    cnt++;
	    }
	N/=cnt;
	ans++;
	}
	return ans;
}
