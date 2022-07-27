static int Icecreams (int N, int D){

    for(int i=1;i<=D;i++){
        N-=N/2;
        N=N*3;
    }
    return N;
}
