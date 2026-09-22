class Solution {
    public int maxProduct(int[] nums) {

        // int maxprod = Integer.MIN_VALUE;
        // int prod = 1;

        // for(int i=0; i<nums.length; i++){
        //     for(int j=i; j<nums.length; j++){

        //         prod *= nums[j];
        //         if(prod>maxprod) maxprod = prod;
        //     }
        //     prod=1;
        // }
        // return maxprod;


// O(n) solution

       int leftprod = 1;
       int rightprod = 1;
       int maxprod=Integer.MIN_VALUE;
       int n= nums.length;

       for(int i=0; i<n; i++){

            leftprod *= nums[i];
            rightprod *= nums[n-1-i];

            maxprod = Integer.max(maxprod, leftprod);
            maxprod = Integer.max(maxprod, rightprod);

            if(nums[i]==0) leftprod=1;
            if(nums[n-1-i]==0) rightprod=1;
       }
       return maxprod; 


        // int curr_prod=1;
        // int max_prod=Integer.MIN_VALUE;

        // for(int num : nums){
        //     curr_prod *= num;

        //     max_prod = Math.max(curr_prod, max_prod); 

        //     if(curr_prod<0) curr_prod=1;

           
        // }
        // return max_prod;
    }
}