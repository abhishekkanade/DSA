class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
// O(nlogn)
        // Arrays.sort(nums);
        // List<Integer> ans = new ArrayList<>();
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]==target) ans.add(i);
        // }
        // return ans;

// O(n)
        int lower=0;
        int higher=0;
        List<Integer> ans = new ArrayList<>();
        int n= nums.length;

        for(int i=0; i<n; i++){
            if(nums[i]<target) lower++;
            else if(nums[i]>target) higher++;
        }

        for(int i= lower; i<n-higher; i++){
            ans.add(i);
        }
        return ans;
    }
}