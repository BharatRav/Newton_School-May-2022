static boolean isPalindrome(int N)
    {
      
      int num = 0;
        int n = N;
        while (N != 0) {
            num = (num * 10) + (N % 10);
            N = N / 10;
        }
        return num == n;
    }
