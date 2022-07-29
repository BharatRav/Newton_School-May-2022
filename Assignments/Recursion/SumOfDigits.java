static long  Sum(long  n) 
    { 
  //Enter your code here
      if(n/10==0){
        return n;
      }
      return n%10 +Sum(n/10);
    }
