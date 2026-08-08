class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder(strs[0]);
        for(int i=1; i< strs.length; i++){
            String str = strs[i];
            int j=0;
            while( j<str.length() && j<ans.length() && str.charAt(j)==(ans.charAt(j)) ) j++;
            ans= new StringBuilder(ans.substring(0, j));
    }
        return ans.toString();
    }
}