class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        


        int i=0;
        int n=s.length();
        int max0s=0;
        int ones =0;
        int prevrun =-1;

        while(i<n){
            if(s.charAt(i)=='1'){
                ones++;
                i++;
            } 
            else{
                int curr0s=0;
                while(i<n && s.charAt(i)=='0'){
                    curr0s++;
                    i++;
                }
                if(prevrun>0)
                    max0s = Math.max(prevrun+curr0s, max0s);
                prevrun=curr0s;
            }
        }

        return ones+max0s;
    }
}