class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            min=Math.min(min, nums[i]);
            max=Math.max(max, nums[i]);
        }
        System.out.println(min+" "+max);

        boolean[] flag = new boolean[max-min-1];
        for(int i=0; i<nums.length; i++){
            if(nums[i]==min || nums[i]==max) continue;
            flag[nums[i]-min-1]=true;

        }

        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0; i<flag.length; i++){
            if(!flag[i]) ans.add(i+min+1);

        }
        return ans;


// T.C. O(nlogn) , S.C.  O(1)         
        // Arrays.sort(nums);
        // ArrayList<Integer> ans=new ArrayList<>();
        // for(int i=1; i<nums.length; i++){
        //     while(nums[i]-1 != nums[i-1]) {
        //         ans.add(nums[i-1]+1);
        //         nums[i-1] +=1;

        //     }
        // }
        // return ans;
    }
}