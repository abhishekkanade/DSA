class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        int i=n-1;
        boolean skip=false;
            
            while(i>=0 && s.charAt(i)==' ' && !skip){
                i--;
            }
            skip=true;
            int j=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            return j-i;
    }
}