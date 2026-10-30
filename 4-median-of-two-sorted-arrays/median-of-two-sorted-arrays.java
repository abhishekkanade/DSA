class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m= nums1.length;
        int n= nums2.length;
        double ans;
        double sum;

        int[] arr = new int[m+n];
        int i=0, j=0, k=0;

        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                arr[k++]=nums1[i++];
            }
            else{
                arr[k++]=nums2[j++];
            }
        }
        while(i<m) arr[k++]=nums1[i++];
        while(j<n) arr[k++]=nums2[j++];

        if(arr.length %2 == 0){
            sum = (long) (arr[k/2] + arr[k/2 - 1]);
            ans = sum/2;
        }
        else{
            ans = arr[k/2];
        }

        return ans;
// WRONG APPROACH - FINDS AVG, NOT ASKED
        // double ans = 0;
        // for(int num: nums1){
        //     ans += num;
        // }
        // for(int num: nums2){
        //     ans += num;
        // }

        // ans = ans/(nums1.length + nums2.length);

        // return ans;
    }
}