static void Pattern(int N){
    int number=0;
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            System.out.print(number+ " ");
            number+=4;
        }
        System.out.println();
        number=6*(i+1);
    }
}
