class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = {-1,-1};
        int low=0;
        int high=nums.length-1;
        boolean flag=false; 
        int first=nums.length;
        int last = nums.length;

        while(low<=high){
            
            int mid= low+(high-low)/2;
            if(target==nums[mid]){
                flag=true;
                break;
            }
            else if(target < nums[mid]) high = mid-1;
            else low = mid+1;
        }

        if(!flag) return ans;

        low=0;
        high=nums.length-1;

        while(low<=high){

            int mid= low+(high-low)/2;

            if(target <= nums[mid] ){
                high=mid-1;
                first = Math.min(first, mid);
            }
            else
                low=mid+1;
        }

        low=0;
        high=nums.length-1;

        while(low<=high){

            int mid= low+(high-low)/2;

            if(target < nums[mid] ){
                high=mid-1;
                last = Math.min(last, mid);
            }
            else
                low=mid+1;
        }
        ans[0]=first;
        ans[1]=last-1;
        return ans;
    }
}