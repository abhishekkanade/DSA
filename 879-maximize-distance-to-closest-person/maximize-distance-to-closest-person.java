class Solution {
    public int maxDistToClosest(int[] seats) {
        int n=seats.length;
        int i=0;
        int j=-1;
        int max=0;
        for(i=0; i<n; i++){
            if(seats[i]==1){ 

                if(j==-1) max=i;
                else{
                max = Math.max(max, (i-j)/2);
                
                }
                j=i;                
            }
        }
        max = Math.max(max, n-j-1);
        return max;
    }
}