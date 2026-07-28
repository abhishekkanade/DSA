class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int n=nums.length;
        int low=0;
        int high=n-1;
        int first=-1;
        int last=-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(target==nums[mid]){
                if(mid>0 && nums[mid]==nums[mid-1]) high=mid-1;
                else{
                    first=mid;
                    break;
                }
            }
            else if(target < nums[mid]) high=mid-1;
            else low=mid+1;
        }

        low=0;
        high=n-1;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(target==nums[mid]){
                if(mid < n-1 && nums[mid]==nums[mid+1]) low=mid+1;
                else{
                    last=mid;
                    break;
                }
            }
            else if(target < nums[mid]) high=mid-1;
            else low=mid+1;
        }

        return new int[]{first, last};



// SAME APPROACH JUST EXTRA WORK

//         int[] ans = {-1,-1};
//         int low=0;
//         int high=nums.length-1;
//         boolean flag=false; 
//         int first=nums.length;
//         int last = nums.length;

// // CHECK IS ELEMENT PRESENT
//         while(low<=high){
            
//             int mid= low+(high-low)/2;
//             if(target==nums[mid]){
//                 flag=true;
//                 break;
//             }
//             else if(target < nums[mid]) high = mid-1;
//             else low = mid+1;
//         }

//         if(!flag) return ans;

// // FIND FIRST OCCURENCE
//         low=0;
//         high=nums.length-1;

//         while(low<=high){

//             int mid= low+(high-low)/2;

//             if(target <= nums[mid] ){
//                 high=mid-1;
//                 first = Math.min(first, mid);
//             }
//             else
//                 low=mid+1;
//         }

// // FIND LAST OCCURENCE
//         low=0;
//         high=nums.length-1;

//         while(low<=high){

//             int mid= low+(high-low)/2;

//             if(target < nums[mid] ){
//                 high=mid-1;
//                 last = Math.min(last, mid);
//             }
//             else
//                 low=mid+1;
//         }
//         ans[0]=first;
//         ans[1]=last-1;
//         return ans;
    }
}