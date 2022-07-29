static void printPattern(int n,int curr, boolean flag)
{
    System.out.print(curr+" ");
    if(curr<=0){
        flag=false;
    }
    if(!flag && curr==n){
        return;
    }
    if(flag){
        printPattern(n,curr-5,flag);
    }
    else{
        printPattern(n,curr+5,flag);
    }
    
}
