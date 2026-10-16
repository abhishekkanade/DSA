class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
// IDEAL APPROACH

        int odd=1;
        int even=0;
        while(even<n || odd<n){
            while(even <n && nums[even]%2==0){
                even +=2;
            }
            while(odd<n && nums[odd]%2==1){
                odd +=2;
            }
            while(even<n && (nums[even]%2!=0) && odd<n && (nums[odd]%2==0)) {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd]  = temp;

                even +=2;
                odd +=2;
            }
        }
        return nums;

// BRUTE FORCE
        // int[] ans = new int[n];
        // int i=0;
        // int j=1;
        // int k=0;
        // while(i<n || j<n){
        //     if(nums[k]%2==0){
        //         ans[i]=nums[k++];
        //         i += 2;
        //     }
        //     else{
        //         ans[j]=nums[k++];
        //         j += 2;
        //     }
        // }
        // return ans;

    }
}