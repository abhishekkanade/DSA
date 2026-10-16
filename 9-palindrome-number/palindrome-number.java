class Solution {
    public boolean isPalindrome(int x) {
        // if(x<0) return false;
        // int temp=x;
        // int d=0;
        // while(temp>0){
        //     d = (d*10)+(temp%10);
        //     temp /= 10;
        // }
        // if(x==d) return true;
        // return false;

        String sb = Integer.toString(x);
        int i=0;
        int j=sb.length()-1;
        System.out.println(sb);
        while(i<j){
            if(sb.charAt(i) == sb.charAt(j)) {
                i++;
                j--;
            }
            else
                 return false;         
        }
        return true;
    }
}