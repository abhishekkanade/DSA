class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        StringBuilder str = new StringBuilder();
        function(n, str, 0, 0);
        return ans;
    }

    void function(int n, StringBuilder str, int open, int close){
        // if( close > open ){
        //     return;
        // }
        if(str.length() == 2*n ){
            ans.add(str.toString());
            return;
        }

        if(open < n) {
            str.append('(');
            function(n, str, open+1, close);
            str.deleteCharAt(str.length()-1);
        }
        
        if(close < open){
            str.append(')');
            function(n, str, open, close+1);
            str.deleteCharAt(str.length()-1);
        }
        
    }
}