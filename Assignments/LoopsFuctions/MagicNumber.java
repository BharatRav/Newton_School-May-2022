public static boolean isNineSevenPresent(int N){
     boolean seven=false,nine=false;
    while(N>0){
        int digit= N%10;
        if(digit==7){
            seven=true;
        }
        else if(digit==9){
                nine=true;
        }
        N=N/10;
    }
    if(seven==true && nine ==true){
            return true;
        }
        return false;
}


static int MagicNumber(int N){
    int count=0;
    while(isNineSevenPresent(N-count)==false && isNineSevenPresent(N+count)== false){
        count++;
    }
    if(isNineSevenPresent(N-count)==true){
        return N-count;
    }
    return N+count;
   
}
