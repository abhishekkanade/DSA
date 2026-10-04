class Solution {
    public boolean checkValidString(String s) {
// ACTUAL GREEDY O(N) APPROACH

        int minOpen =0;
        int maxOpen=0;
        
        for(char c : s.toCharArray()){
            if(c=='('){
                minOpen++;
                maxOpen++;
            }
            else if(c==')'){
                minOpen--;
                maxOpen--;
            }
            else{ // *
                minOpen--; //working as ')'
                maxOpen++; //working as '('
            }
            minOpen = Math.max(0, minOpen);

            if(maxOpen<0) return false;
        }

        return minOpen==0; //all pairs formed properly;



// MY INTUITION - NOT HANDLING * PROPERLY        
        // Stack<Character> st = new Stack<>();
        // for(char c : s.toCharArray()){
        //     if(c=='(') st.push(')');
        //     else if(c=='*' && !st.isEmpty() && st.peek()==')') st.push('*');
        //     else if(c=='*' && !st.isEmpty() && st.peek()=='*') st.pop();
        //     else if(c==')' && !st.isEmpty() ) st.pop();

        // }
        // return st.isEmpty();
    }
}