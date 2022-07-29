static boolean check_Palindrome(String str,int s, int e) 
    { // method 1 without using recursion
    //    while(s<=e){
    //        if(str.charAt(s)!=str.charAt(e))
    //             return false;
    //         s++;e--;
    //    }
    //    return true;

       //methhod 2 using recursion
    if(s>str.length()/2){
            return true;
        }
        return str.charAt(s)==str.charAt(e) && check_Palindrome(str, s+1, e-1);

    }
