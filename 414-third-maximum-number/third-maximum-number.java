class Solution {
    public int thirdMax(int[] nums) {


        long fir =Long.MIN_VALUE;
        long sec =Long.MIN_VALUE;
        long thir =Long.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>fir){
                thir = sec;
                sec=fir;
                fir = nums[i];
            }
            else if(nums[i]<fir && nums[i]>sec){
                thir=sec;
                sec=nums[i];
            }
            else if(nums[i]<sec && nums[i]>thir){
                thir=nums[i];
            }
        }

        if(thir==Long.MIN_VALUE) return (int) fir;
        return (int) thir;



        // Arrays.sort(nums);
        // int k=2;
        // int i=nums.length-1;
        
        // while(i>=1 && k>0){
        //     if(nums[i]!=nums[i-1]) k--;
        //     i--;
        // }
        // if(i<=0) return nums[nums.length-1];
        // return nums[i];
    }
}