class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
        int[] ans = new int[num1.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<num1.length; i++){
            map.put(num1[i], i);
        }

        Stack<Integer> st = new Stack<>();

        for(int i=num2.length-1; i>=0; i--){
            if(st.isEmpty() && map.containsKey(num2[i])){
                ans[map.get(num2[i])]=-1;
                st.push(num2[i]);
            }
            else if(st.isEmpty() && ! map.containsKey(num2[i])){
                st.push(num2[i]);
            }
            else if( ! st.isEmpty() && map.containsKey(num2[i])){
                while( ! st.isEmpty() && st.peek()<=num2[i]){
                    st.pop();
                }
                if(! st.isEmpty()) ans[map.get(num2[i])]=st.peek();
                else ans[map.get(num2[i])]=-1;
                st.push(num2[i]);
            }
            else{
                while( ! st.isEmpty() && st.peek()<=num2[i]){
                    st.pop();
                }
                st.push(num2[i]);
            }
        }
        return ans;

        // for(int i=num1.length-1; i>=0; i--){
        //     int j=i;
        //     while(j<num2.length && num1[i]>=num2[j]){
        //         j++;
        //     }
        //     if(j<num2.length) ans[i]=num2[j];
        //     else ans[i]= -1;
        // }
        // return ans;

        // for(int i=0; i<num1.length; i++){
        //     for(int j=i; j<num2.length; j++){
        //         if(num2[j]>num1[i]){
        //             ans[i]=num2[j];
        //             break;
        //         }
        //         else{
        //             ans[i]=-1;
        //         }
        //     }
        // }
        // return ans;
    }
}