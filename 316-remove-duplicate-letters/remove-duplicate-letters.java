class Solution {
    public String removeDuplicateLetters(String s) {
        
        int[] freq = new int[26];
        boolean[] isPresent = new boolean[26];
        Stack<Character> st = new Stack<>();

        for(int i=0; i< s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }

        int curr = 0;
        while(curr < s.length()){
            char c = s.charAt(curr);
            freq[c-'a']--;

            while(!st.empty() && st.peek()>c && freq[st.peek() -'a']>0 && ! isPresent[c-'a'] ){
               
                isPresent[ st.pop()-'a']=false;
            }
            if(isPresent[c-'a']){
                curr++;
                continue;
            }
            st.push(c);
            isPresent[c-'a']=true;
            curr++;
        }

        StringBuilder ans = new StringBuilder();
        while(!st.empty())
            ans.append(st.pop());

        return ans.reverse().toString();
    }
}