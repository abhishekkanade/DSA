class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        
        int[] arr = new int[s.length()];
        int n=arr.length;

        int i=0;
        for(char c: s.toCharArray()){
            arr[i] = c-'0';
            i++;
        }

        i=0;
        int max0s=0;
        int ones =0;
        int prevrun =-1;

        while(i<n){
            if(arr[i]==1){
                ones++;
                i++;
            } 
            else{
                int curr0s=0;
                while(i<n && arr[i]==0){
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