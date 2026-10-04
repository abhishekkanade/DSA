class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n<1) return false;          //return (n&(n-1)) == 0 ;   using bitwise operator
        
        // while(n%2==0)
        //     n /= 2;

        // if(n==1) return true;
        // return false; 

        return checkPower(n);

    }

    boolean checkPower(int n){
        if(n<1) return false;
        
        if(n==1) return true;

        if(n%2!=0) return false;

        return checkPower(n/2);

    }
   
}