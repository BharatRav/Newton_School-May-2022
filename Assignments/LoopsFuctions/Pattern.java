static void Pattern(int N){
    for(int i=1;i<=N;i++){
        for(int j=1;j<=i;j++){
            if(i==N){
                System.out.print("*");
                continue;
            }
            if(j==1){
                if(i==1){
                    continue;
                }
                System.out.print("*");
                continue;
            }
            System.out.print("^");
        }
        System.out.println("*");
    }
}
