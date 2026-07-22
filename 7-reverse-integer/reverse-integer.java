class Solution {
    public int reverse(int x) {

        if (x <= Integer.MIN_VALUE) return 0;
        int num=x;
        if(x<0) num = -num;
        int right=0;

        while(num != 0 ){
            
             if (right > Integer.MAX_VALUE / 10 || (right == Integer.MAX_VALUE / 10 && (num%10) > 7))
             if (right > Integer.MAX_VALUE / 10 || (right == Integer.MAX_VALUE / 10 && (num%10) > 7))
                return 0;

            right = (right*10) + (num%10);
            num /= 10;
        }

        if(x<0) right = right - (right*2); 

        return right;
    }
}