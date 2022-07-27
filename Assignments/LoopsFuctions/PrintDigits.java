static void Print_Digits(int N){
    int count=0;
    int number=N,rem=0;
    int[] arr= new int[100];
    while(N!=0){
        rem=N%10;
        N=N/10;
        arr[count]=rem;
        count++;
    }
        for(int i=(count-1);i>=0;i--){
            switch(arr[i]){
                case 0:
                        System.out.print("zero ");
                        break;
                case 1:
                        System.out.print("one ");
                        break;
                case 2:
                        System.out.print("two ");
                        break;
                case 3:
                        System.out.print("three ");
                        break;
                case 4:
                        System.out.print("four ");
                        break;
                case 5:
                        System.out.print("five ");
                        break;
                case 6:
                        System.out.print("six ");
                        break;
                case 7:
                        System.out.print("seven ");
                        break;
                case 8:
                        System.out.print("eight ");
                        break;
                case 9:
                        System.out.print("nine ");
                        break;
                                                       
            }
        }
}
