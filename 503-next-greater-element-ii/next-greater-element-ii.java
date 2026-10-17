class Solution {
    public int[] nextGreaterElements(int[] nums) {

       ArrayList<Integer> list = new ArrayList<>();
       int[] ans = new int[nums.length];
       for( int i=0; i<nums.length; i++){
        list.add(nums[i]);
       } 
       for( int i=0; i<nums.length-1; i++){
        list.add(nums[i]);
       }

        int i=list.size()-1;
        Stack<Integer> st= new Stack<>();
        while(i>=nums.length){
            while(!st.isEmpty() && list.get(i)>st.peek()){
                st.pop();
            }
            st.push(list.get(i));
            i--;
        }

        for(i=nums.length-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i]=st.peek();
            }
            else ans[i]=-1;

            st.push(nums[i]);
            
        }
        return ans;
    }
}