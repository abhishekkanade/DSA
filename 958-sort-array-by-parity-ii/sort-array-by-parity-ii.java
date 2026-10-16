class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int i=0;
        int j=1;
        int k=0;
        while(i<n || j<n){
            if(nums[k]%2==0){
                ans[i]=nums[k++];
                i += 2;
            }
            else{
                ans[j]=nums[k++];
                j += 2;
            }
        }
        return ans;

        // while( i< nums.length ){
        //     if((i%2 == 0 && nums[i]%2==0) || (i%2 == 1 && nums[i]%2==1) ){
        //         i++;
        //         continue;
        //     }
        //     else{
        //         int temp = nums[i];
        //         nums[i] = nums[i+1];
        //         nums[i+1] = temp;
        //     }
        // }
        // return nums;
    }
}