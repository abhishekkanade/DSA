class Solution {
    public boolean checkOnesSegment(String s) {
        
        int i=0;
        boolean visited=false;;

        while(i<s.length()){
            if(s.charAt(i)=='0'){
                i++;
                continue;
            }
            else{
                if(visited) return false;
                while( i<s.length() && s.charAt(i)=='1'){
                    i++;
                    visited=true;
                }
            }
        }
        return true;
    }
}