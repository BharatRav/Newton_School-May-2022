static int  Multiply_by_recursion(int M, int N) 
    { 
 
        if(N==0){
          return 0;
        }
        int ans=(M+Multiply_by_recursion(M,N-1));
        return ans;
    }     
